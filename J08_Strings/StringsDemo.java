package J08_Strings;

public class StringsDemo {

    public static void main(String[] args) {

        String name = "Java Programming";

        // Common String Methods
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Contains Java: " + name.contains("Java"));
    }
}