package basics;

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        // 1. Create a scanner object
        Scanner in = new Scanner(System.in);

        //System.out.println("Enter your name: ");
        //String input = in.nextLine();  // SAME AS INPUT() IN PYTHON
        //System.out.println(input);

        //EXERCISE
        // Program to Say "I Love You" in each lang
        // "EN" --> English | "PT-BR" --> Portuguese (Brazil) | "ES" --> Spanish | "JP" --> Japanese | "KR" --> Korean
        while (true) {
            System.out.println("q to quit | Enter the Language Code: ");
            String countryCode = in.nextLine();
            switch (countryCode) {
                case "en":
                    System.out.println("I love You");
                    break;
                case "pt-br":
                    System.out.println("Eu Amo Voce");
                    break;
                case "es":
                    System.out.println("Te Amo");
                    break;
                case "jp":
                    System.out.println("Aishiteru");
                    break;
                case "kr":
                    System.out.println("Saranghae");
                    break;
                case "q":
                    System.exit(0); // terminate the program
                default:
                    System.out.println("Country code Not Suported!");
            }

        }
    }
}
