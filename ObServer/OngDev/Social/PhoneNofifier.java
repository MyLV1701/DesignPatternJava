package OngDev.Social;

import OngDev.VideoData;
import OngDev.base.BaseObserver;
import OngDev.base.Subject;

public class PhoneNofifier extends BaseObserver {
        private Subject subject;

    public PhoneNofifier(Subject s) {
        subject = s;
        subject.attachObserver(this);
    }

    public void notifyObserver(Subject s) {
        VideoData object = (VideoData) s;
        StringBuilder sb = new StringBuilder();
        sb.append("--------------- PhoneNofifier ---------------\n");
        sb.append("The VideoData is changed with the following information :").append("\n");
        sb.append("Title : ").append(object.getTitle()).append("\n");
        sb.append("fileName : ").append(object.getFileName()).append("\n");
        sb.append("description : ").append(object.getDescription()).append("\n");
        System.out.println(sb.toString());
    }
}
