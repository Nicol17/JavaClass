package week2.arrays;

import java.util.Arrays;

public class FindingTheLargestValue {

  public static void main(String[] args) {
    int[] intArray = new int[10];
    int max = 0;
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = (int) ((Math.random() * (100 - 1) + 1));
    }

    for (int j = 0; j < intArray.length; j++) {
      if (intArray[j] > max) {
        max = intArray[j];
      }
    }

    System.out.println("Array: " + Arrays.toString(intArray));
    System.out.println("The largest value is " + max);

  }
}
