package OngDev.base;

public abstract class BaseObserver {
    
    public Subject subject;
    public abstract void notifyObserver(Subject s);
}
