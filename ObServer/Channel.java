import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;    // channel's Name --> eg. CDTeam-Why
    private String tile;    // tile for video will upload
    private List<SubScriber> subList = new ArrayList<>();   // List of SubScribers already subscribed


    public Channel(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getTile() {
        return tile;
    }


    public void addSubscriber(SubScriber s) {
        subList.add(s);
    }

    public void removeSubscriber(SubScriber s) {
        subList.remove(s);
    }


    public void uploadVideo(String tile) {
        this.tile = tile;
        notify2Subscribers();
    }
    
    public void notify2Subscribers() {
        for (SubScriber subScriber : subList) {
            subScriber.update();
        }
    }

}
