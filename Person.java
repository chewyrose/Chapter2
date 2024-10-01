// Parent class Person
public class Person {
    // Fields
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display Person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Subclass Teacher inheriting from Person
class Teacher extends Person {
    // Additional fields for Teacher
    private String institutionName;
    private String courses;

    // Constructor
    public Teacher(String name, int age, String address, String institutionName, String courses) {
        super(name, age, address);  // Call the constructor of the parent class (Person)
        this.institutionName = institutionName;
        this.courses = courses;
    }

    // Method to display Teacher details
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the displayInfo method from the Person class
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Courses: " + courses);
    }
}

