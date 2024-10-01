public class Student {
    // Fields for student information
    private String name;
    private int age;
    private String address;
    private double[] marks;  // Array to hold marks of subjects

    // Constructor
    public Student(String name, int age, String address, double[] marks) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.marks = marks;
    }

    // Method to calculate average marks
    public double calculateAverageMark() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Average Mark: " + calculateAverageMark());
    }
}


