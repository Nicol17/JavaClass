package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = in.nextLine();
        System.out.println("Hi, " + name + "! How old are you?");
        int age = in.nextInt();
        System.out.println("Did you know that in five years you will be " + (age + 5) +
                " years old?\nAnd five years ago you were " + (age - 5) + "! Imagine that!");
    }
}
