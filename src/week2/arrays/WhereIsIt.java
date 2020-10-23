package week2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WhereIsIt {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] intArray = new int[10];
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = (int) ((Math.random() * (50 - 1) + 1));
    }

    System.out.println("Array: " + Arrays.toString(intArray));
    System.out.println("Value to find: ");
    int guess = input.nextInt();

    boolean found = false;
    for (int i = 0; i < intArray.length; i++) {
      if (intArray[i] == guess) {
        System.out.println(guess + " is in Slot " + i);
        found = true;
      }
    }
    if (!found) {
      System.out.println(guess + " is not in the array");
    }




  }
}
