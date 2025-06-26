//Day 4

  class Student {
    // Data members
    String name;
    int age;

    // Parameterized Constructor
     Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        
        Student s1 = new Student("Amit", 20);
        Student s2 = new Student("Neha", 22);
        Student s3 = new Student("Rohan", 21);

        s1.display();
        System.out.println("----");
        s2.display();
        System.out.println("----");
        s3.display();
       
    }
}
