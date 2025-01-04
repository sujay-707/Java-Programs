public class Employee {

    int id;
    String name;
    double salary;

    // Default constructor
    public Employee() {
        // Setting default values
        id = 101;
        name = "SuJAY M Mundaragi";
        salary = 50000.00;
    }

    // Constructor to initialize employee details
    public Employee(String name, int id, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to print the employee's pay slip
    public void printPaySlip() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        
        Employee Emp = new Employee();
        Employee emp = new Employee("SuJAY M", 102, 60000.00);
        Emp.printPaySlip();
       
        emp.printPaySlip(); 
    }
}
