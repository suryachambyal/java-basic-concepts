package J15_SortingPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {

    public static void main(String[] args) {

        Integer[] numbers = {40, 10, 50, 20};

        // Sorting array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}