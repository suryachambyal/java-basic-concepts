package J14_SearchingPrograms;

public class FindMinimumElement {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 78, 23, 89};

        int min = numbers[0];

        // Finding minimum element
        for (int number : numbers) {

            if (number < min) {
                min = number;
            }
        }

        System.out.println("Minimum Element: " + min);
    }
}