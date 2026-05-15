package J06_Methods;

public class MethodsDemo {

    public static void main(String[] args) {

        // Method calling
        int sum = add(10, 20);

        System.out.println("Sum: " + sum);

        greetUser("Surya");
    }

    // Method with return type
    public static int add(int a, int b) {
        return a + b;
    }

    // Void method
    public static void greetUser(String name) {
        System.out.println("Welcome " + name);
    }
}