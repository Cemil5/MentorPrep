package possibleQuestions;
/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@cydeo.com" --> true
str = "test@cydeo.co.in --> true
str = "@cydeo.com" --> false
 */
public class emailCheck {

    public static void main(String[] args) {

        System.out.println(checkEmail("a@cydeo.com"));

    }

    public static boolean checkEmail(String str){
        int sign = str.indexOf("@");
        int dot = str.lastIndexOf(".");

        if (sign < 1 || sign>= str.length()-3 || sign != str.lastIndexOf("@")){
            return false;
        }

        return dot >= 1 && dot != str.length() - 1 && sign <= dot && sign + 1 != dot;
    }
}
