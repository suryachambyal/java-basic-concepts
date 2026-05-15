package J13_MiniExercises;

public class LargestOfThreeNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 40;
        int c = 25;

        // Finding largest number
        if (a > b && a > c) {
            System.out.println("Largest Number: " + a);
        } else if (b > c) {
            System.out.println("Largest Number: " + b);
        } else {
            System.out.println("Largest Number: " + c);
        }
    }
}