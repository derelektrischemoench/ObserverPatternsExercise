package MVC;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.NoSuchElementException;

public class View {
    public static ArrayList<Car> displayAvailableCars() {
        return Car.getAllCars();
    }
    
    public static Car getCar(String model) throws NullPointerException {
        //the user wants to see a car here.
        ArrayList<Car> cars = Car.getAllCars();
        Car d = null;
        
        for(Car c : cars) {
            if (c.getModel().equalsIgnoreCase(model)) {
                return c;
            }
        }
        
        return d;
    }
}
