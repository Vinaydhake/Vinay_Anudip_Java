//Day 5


// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main class to test inheritance
public class singleinheritance {
    public static void main(String[] args) {
        // Creating object of Animal
        Animal a = new Animal();
        a.eat();

        // Creating object of Cat
        Cat c = new Cat();
        c.meow(); // Defined in Cat
        c.eat();  // Inherited from Animal
        
    }
}
