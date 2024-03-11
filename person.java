import java.util.Date;

public class person {
    private String name;
    private Date dateOfBirth;

    // Constructor
    public person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to calculate age based on date of birth
    public int calculateAge() {
        Date currentDate = new Date();
        int age = currentDate.getYear() - dateOfBirth.getYear();
        if (currentDate.getMonth() < dateOfBirth.getMonth() || 
            (currentDate.getMonth() == dateOfBirth.getMonth() && 
            currentDate.getDate() < dateOfBirth.getDate())) {
            age--; // Adjust age if birthday hasn't occurred yet this year
        }
        return age;
    }

    // Method to display person's name
    public void displayPersonName() {
        System.out.println("Name: " + name);
    }

    // Method to display person's age
    public void displayPersonAge() {
        System.out.println("Age: " + calculateAge());
    }

    public static void main(String[] args) {
        // Example usage
        Date dateOfBirth = new Date(94, 5, 15); // Sample date of birth (1994-06-15)
        person person = new person("John Doe", dateOfBirth);
        person.displayPersonName();
        person.displayPersonAge();
    }
}
