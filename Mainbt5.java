public class Main {
    public static void main(String[] args) {
        // Example marks for the student
        double[] marks = {85.5, 90.0, 78.0, 88.5, 92.0};

        // Create a Student object
        Student student = new Student("Alice Johnson", 20, "123 Main Street", marks);

        // Display the student's information and average mark
        student.displayInfo();
    }
}