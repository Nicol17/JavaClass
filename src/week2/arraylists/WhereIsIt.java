package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ArrayList<Integer> intList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      intList.add((int) ((Math.random() * (50 - 1) + 1)));
    }

    System.out.println("ArrayList: " + intList);
    System.out.println("Value to find: ");
    int guess = input.nextInt();

    boolean found = false;
    for ( int i = 0; i < intList.size(); i++) {
      if (intList.get(i).equals(guess)) {
        System.out.println(guess + " is in Slot " + i);
        found = true;
      }
    }
    if (!found) {
      System.out.println(guess + " is not in the ArrayList");
    }

  }

}
