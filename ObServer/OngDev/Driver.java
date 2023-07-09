package OngDev;

import OngDev.Social.FaceBookNotifier;
import OngDev.Social.PhoneNofifier;

public class Driver {
    public static void main(String[] args) {
        
        System.out.println("Hello World \r\nObserver Design pattern Tutorial");
        
        // Creating new video data
        VideoData videoInfo = new VideoData("OngDev", "ObserverTest", "Observer Design Pattern Demo");

        // establish notifier and Subject connection 
        new FaceBookNotifier(videoInfo);
        new PhoneNofifier(videoInfo);

        // try to change Title
        System.out.println("------------------------>>>> Title");
        videoInfo.setTitle("VideoData Channel's Title is changed");

        // try to change FileName 
        System.out.println("------------------------>>>> FileName");
        videoInfo.setFileName("VideoData Channel's FileName is changed");

        // try to change Description 
        System.out.println("------------------------>>>> Description");
        videoInfo.setDescription("VideoData Channel's Description is changed");


    }
}
