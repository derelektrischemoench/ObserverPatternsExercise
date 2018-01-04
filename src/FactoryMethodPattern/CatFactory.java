package FactoryMethodPattern;

public class CatFactory {
    public static final int PEKINESE = 0;
    public static final int SIAMESE = 1;
    
    public Cat createCat(String ConstCatType, String name, String color, String chromosomeset) {
        
        int catType = 2;
        if (ConstCatType.equals("PEKINESE")) {
            catType = 0;
        }
        if (ConstCatType.equals("SIAMESE")) {
            catType = 1;
        }
        
        switch (catType) {
            case 0:
                return new Pekinese(name, color, chromosomeset);//cattype
            case 1:
                return new Siamese(name, color, chromosomeset);
            default:
                throw new IllegalArgumentException("Invalid argument passed to createCat");
        }
        
    }
}
