package oop.finalstatic;

public class Driver {
    public static void main(String[] args) {
        // static --> it belongs to a class itself (blueprint)
        // final --> constant, it cannot change or be modified
        final int x = 10;
        System.out.println(Math.PI);

        Math m = new Math();
        m.name = "Math Library"; // non-static (data fields, instance variable)

        //static method
        int max = Math.max(10, 20);
        System.out.println(max);

        // non-static method
        int min = Math.min(10, 20);
        System.out.println(min);

    }
}
