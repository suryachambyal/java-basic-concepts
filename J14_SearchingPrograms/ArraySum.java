package J14_SearchingPrograms;

public class ArraySum {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        // Calculating array sum
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Array Sum: " + sum);
    }
}