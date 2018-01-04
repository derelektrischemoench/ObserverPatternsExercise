package FactoryMethodPattern;

public class CatFactoryTest {
    public static void main(String[] args) {
        CatFactory cf1 = new CatFactory();
        cf1.createCat("PEKINESE", "Felix", "red", "SiameseGenome");
    }
}
