package labTasks;

/*
 Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
                        if frequency of a character == 1  =========> unique
 */

public class UniqueChars {
    public static void main(String[] args) {

        solution2();

    }

    static void solution1(){
        String str = "aabccdeef";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!(str.replaceFirst(str.charAt(i) + "", "").contains(str.charAt(i) + ""))) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }

    static void solution2(){
        String str = "aabccdeef";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }

    static void solution3(){
        String str = "aabccdeef";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.println(str.charAt(i) + " is unique");
            }
        }
    }
}
