package oop.basics;




public class Car {
    //--> This is creating a blueprint
    // Set of Instance variables (State) (objects from the blueprint)
    String color;
    String brand;
    int year;
    int horsepower;
    int seats;


    //Constructors
    // Keep the default constructor by:
    Car() {
        this.color = "White";
        this.brand = "";
        this.year = 2020;
        this.horsepower = 0;
        this.seats = 3;
    }


    // Constructor (built by yourself)
    // 'Initialize' instance Variables
    Car(String color, String brand, int year, int horsepower, int seats) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.horsepower = horsepower;
        this.seats = seats;
        // .this VERY IMPORTANT, REFERS TO THE INSTANCE ITSELF BEING USED WHEN YOU CREATE THE OBJECT
    }

    // 'Method Overloading'
    // - create methods with the same name with different set of parameters
    void drive(int speed) {
        System.out.println("Driving" + this.brand + "at" + speed + "km/h");
    }

    // Set of Methods (behaviours)
    void drive() {
        System.out.println("Driving..." + this.brand);

    }

    void stop() {
        System.out.println("Stopping...");

    }

}
