public class Main {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.\n");

        // UC9: Recursive Palindrome Check
        String word = "madam";

        boolean isPalindrome = isPalindromeRecursive(word, 0, word.length() - 1);

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }

    // Recursive method to check palindrome
    private static boolean isPalindromeRecursive(String word, int start, int end) {

        // Base condition: crossed pointers
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(word, start + 1, end - 1);
    }
}