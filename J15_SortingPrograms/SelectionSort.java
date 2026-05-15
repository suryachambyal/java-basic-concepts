package J15_SortingPrograms;

public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {64, 25, 12, 22, 11};

        // Selection Sort Logic
        for (int i = 0; i < numbers.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}