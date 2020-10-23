package week2.arrays;

import java.util.Arrays;

public class LocatingTheLargestValue {
  public static void main(String[] args) {
    int[] intArray = new int[10];
    int max = 0;
    int maxIndex = 0;

    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = (int) ((Math.random() * (100 - 1) + 1));
    }

    for (int j = 0; j < intArray.length; j++) {
      if (intArray[j] > max) {
        max = intArray[j];
        maxIndex = j;
      }
    }
    System.out.println("Array: " + Arrays.toString(intArray));
    System.out.println("The largest value is " + max);
    System.out.println("It is located in Slot " + maxIndex);

  }
}
