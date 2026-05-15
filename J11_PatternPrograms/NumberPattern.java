package J11_PatternPrograms;

public class NumberPattern {

    public static void main(String[] args) {

        // Printing number pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}