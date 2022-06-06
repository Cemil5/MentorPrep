package myQuestionForGroup1;


import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailValidation {
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

    @Test
    public static void test() {

        Assert.assertTrue(isEmailValid("a@cydeo.com"));
        Assert.assertTrue(isEmailValid("mike.smith@example.com"));
        Assert.assertTrue(isEmailValid("test@cydeo.co.in"));
        Assert.assertFalse(isEmailValid("test@cydeo.co.in."));
        Assert.assertFalse(isEmailValid("test@@cydeo.co.in"));
        Assert.assertFalse(isEmailValid("mike.smith@.com"));
        Assert.assertFalse(isEmailValid("mike.smith@com"));
        Assert.assertFalse(isEmailValid("mike.smith.com"));
        Assert.assertFalse(isEmailValid("@cydeo.com"));

    }

    public static boolean isEmailValid33(String emailAddress){    // khashayar
        if (emailAddress.contains("@") && emailAddress.contains(".") && emailAddress.indexOf("@") > 0 &&
                emailAddress.lastIndexOf('.') > emailAddress.indexOf("@")+1 && emailAddress.indexOf(".") <
                emailAddress.length() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEmailValid11(String email){   // dilara
        if(Character.isLetter(email.charAt(0))&& email.contains("@")&&email.contains(".")&&
                (email.indexOf('@') < email.lastIndexOf('.')&&(email.indexOf('@')==(email.lastIndexOf('@'))))){
            return true;
        }

        return false;
    }

    public static boolean isEmailValid55(String email){
        return email.indexOf("@") > 0 && email.lastIndexOf('.') > email.indexOf("@") + 1
                && email.indexOf(".") < email.length() - 1;
    }

    public static boolean isEmailValid(String str) {    // my solution
        int sign = str.indexOf("@");
        int dot = str.lastIndexOf(".");

        if (sign < 1 || sign >= str.length() - 3 || sign != str.lastIndexOf("@")) {
            return false;
        }

        return dot != str.length() - 1 && sign <= dot && sign + 1 != dot;
    }
}

