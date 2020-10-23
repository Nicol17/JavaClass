package week2.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindingValueInArrayList {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ArrayList<Integer> intList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      intList.add((int) ((Math.random() * (50 - 1) + 1)));
    }

    System.out.println("ArrayList: " + intList);
    System.out.println("Value to find: ");
    int guess = input.nextInt();

    if (intList.contains(guess)) {
      System.out.println(guess + " is in the ArrayList");
    }

  }
}