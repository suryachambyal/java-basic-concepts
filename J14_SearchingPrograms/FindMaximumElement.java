package J14_SearchingPrograms;

public class FindMaximumElement {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 78, 23, 89};

        int max = numbers[0];

        // Finding maximum element
        for (int number : numbers) {

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximum Element: " + max);
    }
}