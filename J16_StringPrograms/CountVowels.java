package J16_StringPrograms;

public class CountVowels {

    public static void main(String[] args) {

        String text = "Java Programming";
        int count = 0;

        // Counting vowels
        for (int i = 0; i < text.length(); i++) {

            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Total Vowels: " + count);
    }
}