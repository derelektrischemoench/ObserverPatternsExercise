package FactoryMethodPattern;

public abstract class Cat {
    private String name;
    private String color;
    
    public Cat() {
    
    }
    
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
