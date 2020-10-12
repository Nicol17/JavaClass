package basics;
// python --> snake case | Java --> Camel case

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Types
        // The value itself (gets store in memory)

        // To create a variable in Java (static type)
        byte day = 127;  // 8 bits (-128 <=   <= 127)
        short year = 2020; // 16 bits
        long sin = 123456789L;  // 64 bits  | Always put L at the end
        int age = 26;  // 32 bits
        char gender = 'M'; // 1 byte | 'F' char type --> single quotes, single character | 65 = 'A' in ASCII
        char ch = 65;
        boolean flag = true; // True or False
        float weight = 170.56f; // 32 bits  | floating point number  | always finish it with f
        double height = 180.23; // 64bits  | (double precision) floating point numbers  | more default

        // Operators
        // Arithmetic: +, -, *, /, %
        // Assignment: =
        // Comparison: >, <, >=, <=, =, ==, !=
        // Increment (Decrement): ++, --, +=, -=
        // Logical: && (and), || (or), ! (not)

        int x = 10;
        int y = ++x;
        int z = x++;

        System.out.println(x);  // 12
        System.out.println(y);  // 11
        System.out.println(z);  // 11


    }
}
