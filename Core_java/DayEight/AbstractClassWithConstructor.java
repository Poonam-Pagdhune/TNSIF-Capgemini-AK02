package DayEight;

abstract class Vehicle {
    abstract void start();

    abstract void stop();
}

class Car extends Vehicle {
    Car() {
        System.out.println("Car constructor called");
    }

    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

public class AbstractClassWithConstructor {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}

