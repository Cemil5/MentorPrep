package test;

import java.util.Scanner;

public class PossibleExercises_week6 {


    public static void numberOfDays(String month) {

        String result = "";

        if (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("march") || month.equalsIgnoreCase("may") ||
                month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august") || month.equalsIgnoreCase("october") || month.equalsIgnoreCase("december")) {
            result = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase() + " has 31 days.";
        } else if (month.equalsIgnoreCase("april") || month.equalsIgnoreCase("june") || month.equalsIgnoreCase("september")
                || month.equalsIgnoreCase("november")) {

            result = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase() + " has 30 days";

        } else if (month.equalsIgnoreCase("february")) {
            result = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase() + " has 28 days.";
        } else {
            result = "Invalid Name";
        }
        System.out.println(result);
    }




    public static void capitalization(String firstName, String lastName) {
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);
    }



    public static void retrieveDigitsCharsSpecials(){
        String input = "mn@#123Ab!";
        String letters = "",
                digits ="",
                specialChars = "";

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) >= '1' && input.charAt(i) <= '9'){
                digits += input.charAt(i);
            } else if((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') || (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')){
                letters += input.charAt(i);
            } else {
                specialChars += input.charAt(i);
            }
        }
        System.out.println("letters: " + letters + "\ndigits: " + digits
                + "\nspecial chars: " + specialChars);
    }

    public static void isPalindrome(){
        System.out.println("Input a word");
        String input = new Scanner(System.in).nextLine().toLowerCase();
        String reverse = "";

        for(int i = input.length() - 1; i >= 0; i--){
            reverse += input.charAt(i);
        }

        System.out.println(input.equals(reverse));
    }

}
