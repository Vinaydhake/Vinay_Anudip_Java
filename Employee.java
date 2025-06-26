public class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Vinay", 50000);
        Employee e2 = new Employee(2, "Mayur", 60000);
        Employee e3 = new Employee(3, "Uday", 55000);

        e1.display();
        System.out.println("----");
        e2.display();
        System.out.println("----");
        e3.display();
    }
}
