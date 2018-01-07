package SingletonPattern;

import java.util.Calendar;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
    
        System.out.println(a);
        System.out.println(b);
    }
}
