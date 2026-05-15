package J12_NumberPrograms;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 153;
        int originalNumber = number;
        int sum = 0;

        // Calculating cube sum of digits
        while (number > 0) {

            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        if (originalNumber == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}