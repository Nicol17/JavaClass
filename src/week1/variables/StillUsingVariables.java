package week1.variables;

import java.util.Scanner;

public class StillUsingVariables {
    public static String NameGraduation(String name, int graduation) {
        return "My name is " + name + " and I'll graduate in " + graduation;
    }
    public static void main(String[] args) {
        System.out.println(NameGraduation("Nicol", 2010));
    }
}
