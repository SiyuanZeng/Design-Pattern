package weather;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
public interface Subject {
    public void registerObserver(Observable o);
    public void removeObserver(Observable o);
    public void notifyObservers();



}
