package MVC;

import java.util.Scanner;

public class Controller {
    
    public static Car getCarFromUserInput() {
        System.out.println("Please type the name of the Model you want to get");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        
        Car carFromInput = View.getCar(input);
        return carFromInput;
    
    }
    
    public static Car repaintCar(Car c, String color) {
        c.setColor(color);
        return c;
    }
    
}
