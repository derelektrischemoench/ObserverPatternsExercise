package ObserverPattern;

import java.util.ArrayList;
import java.util.Observable;

public class Universe {
    private int numStars;
    private int size;
    private ArrayList<Observer> observersOfUniverse = new ArrayList<Observer>();
    
    public int getNumStars() {
        return numStars;
    }
    
    public void setNumStars(int numStars) {
        this.numStars = numStars;
        notifyAllObservers();
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
        notifyAllObservers();
    }
    
    public void attachObserver(Observer o) {
        observersOfUniverse.add(o);
    }
    
    public void notifyAllObservers() {
        for(Observer o : observersOfUniverse) {
            o.update();
        }
    }
}
