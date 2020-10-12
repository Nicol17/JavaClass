package basics;

public class Hello {
    // psvm + tab --> main methode
    // main method --> you must have this method to run
    public static void main(String[] args) {
        // sout + tab --> print method
        // println --> print with new line
        // print --> print with empty string at the end
        System.out.println("basics.Hello, Java!");
        System.out.print("Vancouver, ");
        System.out.print("BC\n");
        // printf() --> print with format
        // %s --> string | %d --> digit | %f --> float
        System.out.printf("%s class starts at %d:%d pm\n", "Java", 1, 0);


    }
}

// python - interpreted language | dynamic typing
// Java - compiled language | static typing --> faster
//      - source code --> byte code
//      - runs on JVM (Java Virtual Machine) --> 'portable' | Object-Oriented Language