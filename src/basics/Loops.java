package basics;

public class Loops {
    public static void main(String[] args) {
        // * creating a variable
        // 1. declare a variable --> give name and type (int: age;)
        // 2. initialize --> setting an initial value (age = 25)

        // 1. For Loops
        // for (initialize var; condition; increment or decrement) {
        //      code to repeat
        // }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        // infinite loop
        //for (;;) {
          //  System.out.println("Hi");
            //break

        // While loop
        //while (true) {
        //  System.out.println("Bye");
        //break


    // Exercise
        // Using for loop
        // Print int 1 to 20 but 10 numbers each line
        for (int i = 1; i <= 20; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }else {
                System.out.println(i + " ");
            }
        }

        // using while loop
        // even numbers 1 to 100
        int k = 2;
        while (k <= 100) {
            System.out.println(k);
        }


        }
    }

