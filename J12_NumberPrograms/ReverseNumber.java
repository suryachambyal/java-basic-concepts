package J12_NumberPrograms;

public class ReverseNumber {

    public static void main(String[] args) {

        int number = 12345;
        int reverse = 0;

        // Reversing the number
        while (number > 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}