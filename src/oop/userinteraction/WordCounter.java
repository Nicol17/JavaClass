package oop.userinteraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//stdin:keyboard input --> System.in
// stdout: Output (console) --> System.out
//stderr: Display errors ('red' Color) --> System.err

public class WordCounter {
    public static void main(String[] args) {
        int counter = 0;
        //1. Read a text file
        try {
            File file = new File("vancouver.txt");
            Scanner in = new Scanner(file);
            // Read text by 'token' (word)
//            while (in.hasNext()) {
//                System.out.println(in.next());
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String [] words = line.split(" ");
                counter += words.length;
            }
            System.out.println("vancouver.txt contains " + counter + " words.");
        } catch (FileNotFoundException e) {
            System.err.println(e.getLocalizedMessage());
        }

        //2. Command line arguments


        //3.Handle Exceptions
//        if (!args.length = 1) {
//            System.out.println("Invalid number of args. please enter city name");
//        }
    }
}
