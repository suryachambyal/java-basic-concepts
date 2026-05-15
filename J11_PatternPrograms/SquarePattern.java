package J11_PatternPrograms;

public class SquarePattern {

    public static void main(String[] args) {

        // Printing square star pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}