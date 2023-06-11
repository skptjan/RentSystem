package Classes;

import Interfaces.Observer;

public class VehicleFactory implements Observer {
    public Vehicle createCar() {
        Vehicle newCar = new Car();
        newCar.add(this);
        return newCar;
    }

    public Vehicle createTruck() {
        Vehicle newTruck = new Truck();
        newTruck.add(this);
        return newTruck;
    }

    @Override
    public void update() {
        System.out.println("Something changed!");
    }
}
