package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hey, what's your name? (sorry, I keep forgetting lol)");
        String name = in.nextLine();
        System.out.println("OK, " + name + ", How old are you?");
        int age = in.nextInt();
        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        } else if (age <= 17) {
            System.out.println("You can drive but not vote, " + name + ".");
        } else if (age <= 24) {
            System.out.println("You can vote but not rent a car, " + name + ".");
        } else {
            System.out.println("You can do pretty much anything, " + name + ".");
        }
    }
}
