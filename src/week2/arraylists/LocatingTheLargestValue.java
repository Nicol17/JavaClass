package week2.arraylists;

import java.util.ArrayList;

public class LocatingTheLargestValue {

  public static void main(String[] args) {
    ArrayList<Integer> intList = new ArrayList<>();
    int max = 0;
    int maxIndex = 0;
    for (int i = 0; i < 10; i++) {
      intList.add((int) ((Math.random() * (100 - 1) + 1)));
    }

    for (int i = 0; i < intList.size(); i++) {
      if (intList.get(i) > max) {
        max = intList.get(i);
        maxIndex = i;
      }
    }

    System.out.println( "ArrayList: " + intList);
    System.out.println("The largest value is " + max + ", which is located in Slot " + maxIndex);
  }

}
