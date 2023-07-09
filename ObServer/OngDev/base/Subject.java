package OngDev.base;

import java.util.ArrayList;
import java.util.List;

public class Subject{
    private List<BaseObserver> db = new ArrayList<>();
    
    public void attachObserver(BaseObserver o) {
        db.add(o);
    };

    public void deAttachObserver(BaseObserver o) {
        db.remove(o);
    };

    public void notifyObserver(Subject s) {
        for (BaseObserver e : db) {
            e.notifyObserver(s);
        }
    }
}
