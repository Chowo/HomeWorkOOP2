package model;

public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        super.service();
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}