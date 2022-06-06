import java.util.Scanner;

public class NonRepeatingVowel {
    public static void main(String[] args) {
        String word = "google";
        System.out.println(getFirstNonRepeatingVowel(word));
    }

    public static int getFirstNonRepeatingVowel(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                int count = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (currentChar == input.charAt(j)) {
                        count++;
                    }
                }
                if (count == 1){
                    return i;
                }
            }
        }

        return -1;
    }
}
