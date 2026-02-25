import java.util.*;
/* ---------- Strategy Interface ---------- */
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

/* ---------- Stack-Based Strategy ---------- */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }
}

/* ---------- Deque-Based Strategy ---------- */
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

/* ---------- Context Class ---------- */
class PalindromeChecker {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.isPalindrome(input);
    }
}

/* ---------- Main Class ---------- */
public class Main {

    public static void main(String[] args) {

        String input = "madam";

        PalindromeChecker checker = new PalindromeChecker();

        // Strategy 1: Stack
        checker.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: "
                + checker.check(input));

        // Strategy 2: Deque
        checker.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy: "
                + checker.check(input));
    }
}