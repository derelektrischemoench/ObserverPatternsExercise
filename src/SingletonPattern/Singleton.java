package SingletonPattern;

public class Singleton {
    private static String name;
    public static Singleton self = new Singleton(); // thats trick 1; class has itself as class variable
    
    private Singleton() {
        //empty constructor
    }
    
    public static Singleton getInstance() {
        return self;
    }
    
    //testmethod
    protected static void singletonDoPrint(){
        System.out.println("Hey yall");
    }
    
}
