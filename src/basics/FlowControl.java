package basics;

public class FlowControl {
    public static void main(String[] args) {
        // {} --> Curly Braces
        // [] --> Square brackets
        // () --> Parenthesis
        // "" --> double quotes
        // '' --> single quotes
        // & --> ampersand
        // ; --> semi-colon
        // : --> colon
        // * --> star asterisk
        // | --> vertical bar
        // - --> dash
        // ` --> back tick
        // ~ --> tilde
        // / --> slash
        // \ --> back slash
        // ^ --> caret

        int age = 21;
        if (age > 50) {
            System.out.println("Age is greater than 50.");
        } else if (age > 30 && age <= 50) {
            System.out.println("Age is greater than 30 less than 50.");
        } else {
            System.out.println("Age is lower than 30.");

            // 2. switch statement
            int salary = 1_000_000; // makes the code more readable
            switch (salary) {
                case 1_000_000:
                    System.out.println("Pretty good!");
                    break;
                case 100_000:
                    System.out.println("Senior Dev");
                    break;
                case 80_000:
                    System.out.println("Intermediate Dev");
                    break;
                case 50_000:
                    System.out.println("Junior Dev");
                    break;
                default:
                    System.out.println("Unemployed");
                    break;              // YOU HAVE TO PUT BREAK!!!!!
            }


        }
    }
}



