package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        System.out.println("I will add up the numbers you give me. (0 to break)");
        System.out.println("Number: ");
        int num = in.nextInt();
        while (true) {
            if (num != 0) {
                total = total + num;
                System.out.println("The total so far is " + total);
                System.out.println("Number: ");
                num = in.nextInt();
            } if (num == 0) {
                System.out.println("The total is " + total);
                break;
            }
        }
    }
}


