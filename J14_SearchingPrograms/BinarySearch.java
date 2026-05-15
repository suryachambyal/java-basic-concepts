package J14_SearchingPrograms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // Binary Search
        int index = Arrays.binarySearch(numbers, 40);

        System.out.println("Element Found At Index: " + index);
    }
}