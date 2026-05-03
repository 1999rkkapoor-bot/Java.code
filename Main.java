class Car {
    String model;
    int year;

    // A method to display car details
    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object of class Car
        myCar.model = "Tesla Model 3";
        myCar.year = 2024;
        
        myCar.displayInfo(); // Calling the method
    }
}
