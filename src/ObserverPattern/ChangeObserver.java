package ObserverPattern;

public class ChangeObserver extends Observer {
    
    public ChangeObserver(Universe u) {
        this.u = u;
        this.u.attachObserver(this);
    }
    
    @Override
    public void update() {
        System.out.println("Stuff has changed - notified by changeObserver");
        System.out.println("New numstars = " + u.getNumStars());
        System.out.println("New size = " + u.getSize());
    }
}
