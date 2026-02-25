public class Main {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.\n");

        // UC10: Case-Insensitive & Space-Ignored Palindrome Check
        String input = "Madam In Eden Im Adam";

        // Step 1: Normalize string (remove spaces, convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = isPalindrome(normalized);

        // Print result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }
    }

    // Palindrome check using two-pointer technique
    private static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}