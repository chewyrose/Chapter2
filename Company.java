public class Company {
    // Fields
    private String name;
    private String address;
    private double cost;
    private double income;

    // Constructor
    public Company(String name, String address, double cost, double income) {
        this.name = name;
        this.address = address;
        this.cost = cost;
        this.income = income;
    }

    // Method to calculate benefit
    public double calculateBenefit() {
        return income - cost;
    }

    // Method to display company information
    public void displayInfo() {
        System.out.println("Company Name: " + name);
        System.out.println("Company Address: " + address);
        System.out.println("Cost: " + cost);
        System.out.println("Income: " + income);
        System.out.println("Benefit: " + calculateBenefit());
    }
}


