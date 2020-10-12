package basics;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        // 'Array' --> "Fixed size", sequence of elements same type
        // 1. array literal syntax

        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println(arr1.length);

        // access elements in array
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length - 1]);

        // 1. Traditional for loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // change the element
        arr1[0] = 7;

        //2. for each loop
        for (int elem : arr1) {
            System.out.println(elem);
        }

        //System.out.println(arr1); --> Prints the memory address of the array
        System.out.println(Arrays.toString(arr1)); // --> Prints the actual Array

        //  COLLECTIONS ARE HELPER FUNCTIONS, CHECK THEM OUT


        // 2. Create an Array with "size"\
        // create new array size 10
        // by default, initial values will be all 0
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));  // --> 1 to 10

        //  int[] arr3 = new int[] {1, 2};

        // string array
        String[] countries = {"Canada", "Japan", "Brazil", "Spain", "Germany", "Korea"};
        for (String country: countries) {
            System.out.println(country);
        }


    }
}
