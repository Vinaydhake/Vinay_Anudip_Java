public class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }

    static class Car extends Vehicle {
        void start() {
            System.out.println("Car is starting");
        }
    }

    static class Bike extends Vehicle {
        void start() {
            System.out.println("Bike is starting");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}

