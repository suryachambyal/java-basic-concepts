package J10_TypeCasting;

public class TypeCastingDemo {

    public static void main(String[] args) {

        int number = 100;

        // Implicit Type Casting
        double convertedNumber = number;

        System.out.println("Implicit Casting: " + convertedNumber);

        double salary = 55000.75;

        // Explicit Type Casting
        int finalSalary = (int) salary;

        System.out.println("Explicit Casting: " + finalSalary);
    }
}