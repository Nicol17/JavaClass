package miniproject2;

import java.util.Scanner;

public class InputCollector {

  public static String getUserInput(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.println(prompt);
    String option = input.next();
    if (option.length() > 1) {
      System.out.println("Input only 1 character");
    } else if (Character.isLetter(option.charAt(0))) {
      System.out.println("Enter a digit from 1 to 5");
    } else if (Integer.parseInt(option) < 1 && Integer.parseInt(option) > 5) {
      System.out.println("Input only a number from 1 to 5");
    }
    return option;
  }
}


