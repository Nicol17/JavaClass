package week2.arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicArrayLists2 {

  public static void main(String[] args) {
    ArrayList<Integer> intList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      intList.add((int) ((Math.random() * (100 - 1) + 1)));
    }

    System.out.println( "ArrayList: " + intList);
  }

}
