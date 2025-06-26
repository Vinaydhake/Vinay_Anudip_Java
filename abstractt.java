/*What is Abstraction in Java?
Abstraction is the process of hiding complex implementation details and 
showing only essential features to the user.

In Java, this is done using:

abstract classes

abstract methods

You can think of it like using a TV remote—you press the power button, 
and the TV turns on. You don’t know (and don’t need to know) the internal electronics that make that happen.

🏎 Real-Life Analogy: Car and Accelerator
What You Know as a Driver:
When you press the accelerator, the car speeds up.

What You Don’t See (Hidden Details):
Sensors detect the pedal press.

Fuel is injected into the engine (in petrol cars).

Electric current increases (in electric cars).

Engine or motor increases RPM (revolutions per minute).

Wheels rotate faster, moving the car quicker.

 All of this is complex. As a driver, you don't care how it works—only that it works.*/

 // Abstract class representing the general idea of a Car

 // Abstract class representing a generic car
abstract class Car {
    // Common method for all cars
    void startEngine() {
        System.out.println("Car engine started.");
    }

    // Abstract method – tells what the car does, but not how
    abstract void accelerate();
}

// PetrolCar: internal working is hidden inside private methods
class PetrolCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Petrol Car: Accelerating...");
        injectFuel();
        igniteFuel();
        increaseRPM();
        System.out.println("Petrol Car is speeding up!\n");
    }

    // Internal details (hidden from user)
    private void injectFuel() {
        System.out.println("  [Internal] Injecting petrol into engine...");
    }

    private void igniteFuel() {
        System.out.println("  [Internal] Igniting fuel-air mixture...");
    }

    private void increaseRPM() {
        System.out.println("  [Internal] Crankshaft spinning faster (RPM increasing)...");
    }
}

// ElectricCar: also hides its internal working
class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric Car: Accelerating...");
        supplyCurrent();
        rotateMotor();
        increaseTorque();
        System.out.println("Electric Car is silently speeding up!\n");
    }

    // Internal details (hidden from user)
    private void supplyCurrent() {
        System.out.println("  [Internal] Increasing electric current to motor...");
    }

    private void rotateMotor() {
        System.out.println("  [Internal] Rotating motor shaft...");
    }

    private void increaseTorque() {
        System.out.println("  [Internal] Torque applied to wheels increasing...");
    }
}

// Main class to test both cars
public class abstractt{
    public static void main(String[] args) {
        // Abstract reference, concrete object – this is abstraction in action!
        Car myPetrolCar = new PetrolCar();
        myPetrolCar.startEngine();
        myPetrolCar.accelerate();

        Car myElectricCar = new ElectricCar();
        myElectricCar.startEngine();
        myElectricCar.accelerate();
    }
}
