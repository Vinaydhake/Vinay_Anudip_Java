interface one{

    public void eat(); //abstract method no body

interface two{

    public void bark(); //abstract method no body
}

interface three extends one,two{
    public void meow(); //abstract method no body
}

class ChildClass implements one,two{
    public void eat() {
        System.out.println("ChildClass is eating");
    }

    public void bark() {
        System.out.println("ChildClass is barking");
    }

    public static void main(String[] args) {
        // Create an object o
    ChildClass c = new ChildClass();
        c.eat();
        c.bark();
    }

}
}