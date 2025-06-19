// Interface 1
interface one {
    void eat();
}

// Interface 2
interface two {
    void sound();
}


class CatDog implements one, two {
    public void eat() {
        System.out.println("CatDog is eating");
    }

    public void sound() {
        System.out.println("CatDog makes meow and bhaw bhaw barking sound");
    }
}

// Main class
public class multiple{
    public static void main(String[] args) {
        // Creating two instances
        CatDog one = new CatDog();
        CatDog two = new CatDog();

        // Using instance 'one'
        System.out.println("Instance one:");
        one.eat();
        one.sound();

        // Using instance 'two'
        System.out.println("Instance two:");
        two.eat();
        two.sound();
    }
}
