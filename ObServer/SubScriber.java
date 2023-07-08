public class SubScriber {
    private String name;
    private Channel channel;

    public SubScriber(String name) {
        this.name = name;
    }


    public void update() {
        System.out.println("hey " + name + " new video with tile : " + channel.getTile() + " uploaded, checkout now !!!");
    }


    public void subscribeChannel(Channel ch) {
        this.channel = ch;
    }

    
}
