public class Youtube {
    
    public static void main(String[] args) {
        
        Channel ch = new Channel("Kien Thuc Thu Vi");

        SubScriber s1 = new SubScriber("Tam Tran");
        SubScriber s2 = new SubScriber("Truong Hoang");
        SubScriber s3 = new SubScriber("Hoang Quan");
        SubScriber s4 = new SubScriber("Hai Luong");
        SubScriber s5 = new SubScriber("Hai Bang");

        s1.subscribeChannel(ch);
        s2.subscribeChannel(ch);
        s3.subscribeChannel(ch);
        s4.subscribeChannel(ch);
        s5.subscribeChannel(ch);
        
        ch.addSubscriber(s1);
        ch.addSubscriber(s2);
        ch.addSubscriber(s3);
        ch.addSubscriber(s4);
        ch.addSubscriber(s5);

        ch.uploadVideo("[WC2026] Viet Nam vs Tay Ban Nha");

    }

}
