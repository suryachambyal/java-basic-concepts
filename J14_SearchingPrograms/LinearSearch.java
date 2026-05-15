package J14_SearchingPrograms;

public class LinearSearch {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;

        // Linear Search Logic
        for (int number : numbers) {

            if (number == target) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Element Found" : "Element Not Found");
    }
}