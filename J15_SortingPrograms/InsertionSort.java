package J15_SortingPrograms;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {9, 5, 1, 4, 3};

        // Insertion Sort Logic
        for (int i = 1; i < numbers.length; i++) {

            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = key;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}