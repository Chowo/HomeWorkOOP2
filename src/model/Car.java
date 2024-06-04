package model;

public class Car extends Vehicle {

    public Car(String modelName) {
        super(modelName, 4);
    }

    public void service() {
        super.service();
        System.out.println("Проверяем двигатель");
    }


}
