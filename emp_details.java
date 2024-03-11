import java.util.Date;

public class emp_details extends person {
    private int empId;
    private double salary;

    // Constructor
    public emp_details(String name, Date dateOfBirth, int empId, double salary) {
        super(name, dateOfBirth);
        this.empId = empId;
        this.salary = salary;
    }

    // Getter for employee ID
    public int getEmpId() {
        return empId;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details including name, age, empId, and salary
    public void displayEmployeeDetails() {
        displayPersonName();
        displayPersonAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Example usage
        Date dateOfBirth = new Date(94, 5, 15); // Sample date of birth (1994-06-15)
        emp_details employee = new emp_details("John Doe", dateOfBirth, 12345, 50000.00);
        employee.displayEmployeeDetails();
    }
}
