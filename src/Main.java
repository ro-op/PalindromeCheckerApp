import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.\n");

        // UC6: Queue + Stack Based Palindrome Check
        String word = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);     // FIFO
            stack.push(ch);    // LIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) vs pop (stack)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}