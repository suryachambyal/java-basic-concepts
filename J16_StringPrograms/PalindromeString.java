package J16_StringPrograms;

public class PalindromeString {

    public static void main(String[] args) {

        String text = "madam";
        String reverse = "";

        // Reversing string
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        System.out.println(text.equals(reverse) ? "Palindrome String" : "Not a Palindrome String");
    }
}