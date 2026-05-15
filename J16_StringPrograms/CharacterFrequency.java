package J16_StringPrograms;

public class CharacterFrequency {

    public static void main(String[] args) {

        String text = "programming";
        char target = 'g';
        int count = 0;

        // Counting character frequency
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Character Frequency: " + count);
    }
}