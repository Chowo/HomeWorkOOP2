import model.*;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("car1");
        Vehicle car2 = new Car("car2");


        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);


        Vehicle bicycle = new Bicycle("bicycle1");
        Vehicle bicycle2 = new Bicycle("bicycle2");


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
