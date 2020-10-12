package basics;

// Memory:
// HEAP / STACK / DATA / CODE
public class StringsExample {
    public static void main(String[] args) {
        // 1. String literal
        String name = "Nicol";
        String name1 = new String("Nicol");
        String name2 = "Nicol";

        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

        System.out.println(name == name1); // false --> allocated in different parts of the memory, so the memory reference is 0
        System.out.println(name == name2); // true --> Both created literal, same data segment (read only)
        System.out.println(name1 == name2); // false

        // NEVER USE == TO COMPARE STRINGS! It's comparing memory addresses
        // Comparing Strings the right Way:
        System.out.println(name1.equals(name2));    // true
        System.out.println(!name1.equals(name2));    // false   NOT  EQUALS

        // Length --> number of characters
        System.out.println(name.length());    // 5

        String cafe = "Starbucks"; // Second cup, blenz, timmy's
        //             012345678
        System.out.println(cafe.substring(0, 4));    // Star
        System.out.println(cafe.indexOf("bucks"));    // 4

        // EXERCISE
        // print every character in a String
        String brand = "Panasonic";
        for (int i = 0; i < brand.length(); i++) {
            System.out.println(brand.substring(i, i + 1));
            System.out.println(brand.charAt(i));
        }

        for (char ch : brand.toCharArray()) {
            System.out.println(ch);
        }
    }
}
