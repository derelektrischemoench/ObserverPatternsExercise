package FactoryMethodPattern;

public class Siamese extends Cat {
    private String chromosomeSet;
    
    public Siamese(String name, String color, String chromosomeSet) {
        super(name, color);
        this.chromosomeSet = chromosomeSet;
        System.out.println("Siamese cat created");
    }
    
    public String getChromosomeSet() {
        return this.chromosomeSet;
    }
}
