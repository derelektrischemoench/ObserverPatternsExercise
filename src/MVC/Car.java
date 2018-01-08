package MVC;

import java.util.ArrayList;

public class Car {
    private String manufacturer;
    private String model;
    private String color;
    private static ArrayList<Car> allCars = new ArrayList<>();
    
    public Car(String manufacturer, String model, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        allCars.add(this);
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getModel() {
        return model;
    }
    
    public static ArrayList<Car> getAllCars() {
        return allCars;
    }
    
    public static ArrayList<String> getCarNames() {
        ArrayList<String> carStrings = new ArrayList<String>();
        for(Car c:allCars) {
            String CarName = c.getModel();
            carStrings.add(CarName);
        }
        return carStrings;
    }
}
