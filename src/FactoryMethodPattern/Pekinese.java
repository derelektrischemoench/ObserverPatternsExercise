package FactoryMethodPattern;

public class Pekinese extends Cat {
    private String chromosomeSet;

    public Pekinese(String name, String color, String chromosomeSet) {
        super(name, color);
        this.chromosomeSet = chromosomeSet;
        System.out.println("Pekinese cat created");
    }
}
