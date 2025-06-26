class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class SingleInheritance1 {
    public static void main(String[] args) {
        
        //create the object of child class
        Animal a= new Animal();
        a.eat();
        //create the object of child class
       Cat c= new Cat();
        c.meow();
        c.eat();
    }
}
