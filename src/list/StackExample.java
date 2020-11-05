package list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExample {

  public static void main(String[] args) {
    // Stack class is a legacy class (v1.0)
    Stack<String> s1 = new Stack<>();

    // v1.6 ArrayDeque
    ArrayDeque<String> stack = new ArrayDeque<>();
    stack.push("Tenet");
    stack.push("Catch me if you can");
    stack.push("Forrest Gump");
    stack.push("Back to the future");
    stack.push("Star wars");
    stack.push("Home Alone");
    System.out.println(stack.size());



    //EXCERCISE
/**
 * Write a function checkBalance that accepts a string of source code
 * and checks whether the braces/parentheses are balanced.
 * Every ( or { must be closed by a } or ) in the opposite order
 * Return the index at which an imbalance occurs, or -1 if balanced
 * If any ( or { are never closed, return the string's length
 *
 * (Example)
 *   checkBalance("if (a(4) > 9) { foo(a(2)); }") returns -1
 *   checkBalance("for  (i=0;i<(3};i++) { foo{)); )") returns 14
 *   checkBalance("if (x)  {") returns 8
 */
//    public static int checkBalance(String src) {
//      Deque<String> stack1 = new ArrayDeque<>();
//      for (int i = 0; i < src.length(); i++) {
//
//      }
//    }

  }
}
