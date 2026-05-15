package J11_PatternPrograms;

public class RightTrianglePattern {

    public static void main(String[] args) {

        // Printing right triangle pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}