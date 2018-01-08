package MVC;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Car c = new Car("Ford", "Mustang", "cherryred");
        Car d = new Car("Ford", "Pinto", "shitbrown");
        Car e = new Car("Cadillac", "Escalade", "silver");
        
        System.out.println("Available cars \n");
        for (Car ca : Car.getAllCars()) {
            System.out.println(ca.getManufacturer() + " " + ca.getModel() + " " + ca.getColor() + "\n");
        }
        
        try {
            Car car = Controller.getCarFromUserInput();
            System.out.println("Your car is a: " + car.getColor() + " " + car.getManufacturer());
            Scanner sc = new Scanner(System.in);
            
            while (true) {
                System.out.println("Do you want to repaint the car y/n");
                String input = sc.next();

                if (input.equalsIgnoreCase("y")) {
                    System.out.println("you chose yes");
                    System.out.println("Which color?");
                    String chosenColor = sc.next();
                    Car repaintedCar = Controller.repaintCar(car, chosenColor);
                    
                    System.out.println("Car repainted, it is now " + repaintedCar.getColor());
                    break;
                
                } else if (input.equalsIgnoreCase("n")) {
                    System.out.println("You chose no");
                    break;
                    
                } else {
                    System.out.println("invalid choice, please try again");
                }
            }
    
            System.out.println("a valid choice broke the loop");
            
            
        } catch (NullPointerException npe) {
            System.out.println("Unfortunately there is no such car");
        }
        
    }
}
