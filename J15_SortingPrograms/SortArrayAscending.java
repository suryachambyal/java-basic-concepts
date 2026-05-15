package J15_SortingPrograms;

import java.util.Arrays;

public class SortArrayAscending {

    public static void main(String[] args) {

        int[] numbers = {40, 10, 50, 20};

        // Sorting array in ascending order
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}