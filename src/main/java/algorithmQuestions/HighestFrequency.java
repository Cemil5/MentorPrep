
public class HighestFrequency {
    public static void main(String[] args) {
        String text = "aaabbccccddeeee";
        // Developer decleras this max variable in order to use it inside for loops
        int max = 0;
        // Developer aims to return this result at the end of for loops,
        // if he/she finds the max repeated character he/she aims to update it inside loops -> line 25 and 30 updates this
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            // count refreshes in each iteration so that developer aims to find all characters repetition...
            int count = 0;
            for (int j = 0; j < text.length(); j++) {

                // This if statement compares each character in this String
                if (text.charAt(i) == text.charAt(j)) {
                    // If compiler finds any match incrementing the count...
                    count++;
                }
                // If we want to find the highest freq, then we can use an empty bucket to put our count in it...
                if (count > max) {
                    max = count;
                    // At first result was empthy, we need to convert our char to String and assign it to result here...
                    result = text.charAt(j) + "";
                }
                // In next iterations result may not be empthy, this if block checks this condition...
                if (count >= max && !result.contains(text.charAt(i) + "")) {
                    // this line adds another same freq char to result
                    result += text.charAt(j) + "";
                }
            }
        }
        System.out.println(result);
    }
}
