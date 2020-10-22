package miniproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public void playHangman() throws FileNotFoundException {
        // Read the text document that contains the database for the cities
        File cities = new File("src/miniproject1/cities.txt");
        Scanner text = new Scanner(cities);
        Scanner input = new Scanner(System.in);

        // Import the cities from the text document to an Array
        ArrayList<String> cityList = new ArrayList<>();
        while (text.hasNext()) {
            cityList.add(text.nextLine());
        }
        System.out.println(cityList);

        // Select a random city from the array and display it
        String randomWord = cityList.get((int) (Math.random() * cityList.size()));
        System.out.println(randomWord);

        // hide characters and substitute them wih underscore
        char[] hiddenWord = randomWord.toCharArray();
        for (int i = 0; i < hiddenWord.length; i++) {
            if (hiddenWord[i] == ' ') {
                hiddenWord[i] = ' ';
            } else {
                hiddenWord[i] = '_';
            }
        }
        System.out.println("Here's the hidden city: ");
        System.out.println(hiddenWord);
        // While Loop Using Chances
        int chances = 10;
        String usedChars = new String("");


        while (chances > 0) {
            System.out.print("Guess a letter: ");
            String letter = input.next();
            // INPUT VALIDATION!!!
            boolean valid = true;
            if (letter.length() > 1) {
                valid = false;
                System.out.println("You can only enter one letter as input");
                System.out.print("Try again: ");
                continue;            }
            if (!Character.isLetter(letter.charAt(0))) {
                valid = false;
                System.out.println("Wrong input, enter a character please");
                System.out.print("Try again: ");
                continue;
            }
            // space input
            if (letter.equals(" ")) {
                valid = false;
                System.out.println("Wrong input, enter a character please");
                System.out.print("Try again: ");
                continue;
            }

            // do not repeat characters already used
            if (usedChars.contains(letter)) {
                valid = false;
                System.out.println(letter + " has already been guessed");
                System.out.print("Try again: ");
                continue;
            }
            // Read user input and search for it in randomWord.
            boolean contains = false;
            for (int i = 0; i < hiddenWord.length; i++) {
                if (valid && String.valueOf(randomWord.toCharArray()[i]).equalsIgnoreCase(letter)) {
                    contains = true;
                    System.out.print("You're right! ");
                    hiddenWord[i] = randomWord.toCharArray()[i];
                    usedChars.concat(letter);
                }
            } // Keep track of errors
            if (valid && !contains) {
                System.out.print("Wrong! ");
                chances -= 1;
                usedChars.concat(letter);
            }
            System.out.println(usedChars);
            System.out.println("You have (" + chances + ") chances left");
            System.out.println("You are guessing: " + new String(hiddenWord));




            // CONDITIONALS
            // Finish Game if word Completed
            if (new String(hiddenWord).equals(randomWord)) {
                System.out.println("You Win!\nThe hidden word was " + randomWord);
                break;
            }
            // Finish game if chances = 0
            if (chances == 0) {
                System.out.println("You Lose!\nThe hidden word was " + randomWord);
                break;
            }
        }
    }
}

