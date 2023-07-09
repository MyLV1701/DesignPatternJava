package OngDev;

import OngDev.base.Subject;

public class VideoData extends Subject {
    private String title;
    private String fileName;
    private String description;
   

    public VideoData(String title, String fileName, String description) {
        this.title = title;
        this.fileName = fileName;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notificationChanged();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        notificationChanged();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        notificationChanged();
    }


    public void notificationChanged() {
        notifyObserver(this);
    }

}
