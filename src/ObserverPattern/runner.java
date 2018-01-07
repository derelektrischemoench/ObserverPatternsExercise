package ObserverPattern;

import java.util.Observer;
import java.util.Random;

public class runner {
    public static void main(String[] args) {
        Universe u = new Universe();
        Random randomInt = new Random();
        new ChangeObserver(u);
        
        while(true) {
            u.setNumStars(randomInt.nextInt(100000));
            u.setSize(randomInt.nextInt(100000));
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                System.out.println("Interrupt");
            }
        }
        
       
    }
}
