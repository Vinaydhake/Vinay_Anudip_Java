
class Employee {
    
    private String name;
    private double salary;

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Vinay");
        e.setSalary(50000);

        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee Salary: " + e.getSalary());
    }
}
