package week2.arrays;

import java.util.Arrays;

public class CopyingArrays {

  public static void main(String[] args) {
    int [] intArray = new int[10];
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = (int)((Math.random() * (100 - 1) + 1));
    }

    int [] intArray2 = intArray.clone();
    intArray2[intArray2.length - 1] = -7;

    System.out.println("Array 1: " + Arrays.toString(intArray));
    System.out.println("Array 2: " + Arrays.toString(intArray2));

  }

}
