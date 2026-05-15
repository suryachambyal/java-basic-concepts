package J12_NumberPrograms;

public class FactorialNumber {

    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        // Calculating factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}