package model;

public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                ((Car) vehicle).updateTyre();
            }
            ((Car) vehicle).checkEngine();
        } else if (vehicle instanceof Truck) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                ((Truck) vehicle).updateTyre();
            }
            ((Truck) vehicle).checkEngine();
            ((Truck) vehicle).checkTrailer();
        } else if (vehicle instanceof Bicycle) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                ((Bicycle) vehicle).updateTyre();
            }
        }
    }
}
