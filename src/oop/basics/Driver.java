package oop.basics;

public class Driver {
    public static void main(String[] args) {
        // Car instance (object)
        // new Car() --> Constructor (builder) --> Special method
        // - if no constructor, Java will give you a default constructor
        // Default constructor --> Constructor without any parameters (brand, year....)
        Car c1 = new Car("Yellow","Lamborghini", 2020, 550, 2); // create a new instance --> new object (new car)
        c1.drive();

        c1.drive(290);

        c1.stop();


        Car c2 = new Car(); //--> Another one
        c2.brand = "Ferrari";
        c2.color = "Red";
        c2.year = 2020;
        c2.horsepower =540;
        c2.seats = 2;

        c2.drive();

        c2.stop();


    }
}
