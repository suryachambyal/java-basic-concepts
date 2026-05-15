package J11_PatternPrograms;

public class InvertedTrianglePattern {

    public static void main(String[] args) {

        // Printing inverted triangle pattern
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}