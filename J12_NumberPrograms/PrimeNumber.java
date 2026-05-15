package J12_NumberPrograms;

public class PrimeNumber {

    public static void main(String[] args) {

        int number = 13;
        boolean isPrime = true;

        // Checking prime condition
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime Number" : "Not a Prime Number");
    }
}