package J02_Operators;

public class OperatorsDemo {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b : " + (a > b));
        System.out.println("a == b : " + (a == b));

        // Logical Operator
        boolean result = (a > b) && (b > 5);

        System.out.println("Logical AND Result: " + result);
    }
}