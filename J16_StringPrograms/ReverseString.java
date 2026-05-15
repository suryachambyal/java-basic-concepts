package J16_StringPrograms;

public class ReverseString {

    public static void main(String[] args) {

        String text = "Java";
        String reverse = "";

        // Reversing string
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);
    }
}