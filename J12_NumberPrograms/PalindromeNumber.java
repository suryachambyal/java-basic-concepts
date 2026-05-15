package J12_NumberPrograms;

public class PalindromeNumber {

    public static void main(String[] args) {

        int number = 121;
        int originalNumber = number;
        int reverse = 0;

        // Reversing the number
        while (number > 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        // Checking palindrome condition
        if (originalNumber == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}