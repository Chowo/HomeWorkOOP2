package model;

public class Bicycle extends Vehicle implements hasTyre {

    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


}
