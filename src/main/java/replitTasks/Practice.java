package replitTasks;

import java.util.Locale;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner scan = new Scanner(System.in);
            String email = scan.next();

            //WRITE YOUR CODE BELOW

            System.out.println("First name: " + separate(email, "firstName"));
            System.out.println("Last name: " + separate(email, "lastName"));
            System.out.println("Domain: " + separate(email, "domain"));
    }

    public static String separate(String email, String partName) {
        email = email.toLowerCase();
        partName = partName.toLowerCase();
        String result = "";
        switch (partName) {
            case "firstname":
                result = email.substring(0, email.indexOf('_'));
                break;
            case "lastname":
                result = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
                break;
            default:
                result = email.substring(email.indexOf('@')+1, email.indexOf('.'));
        }
        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }

    void test(){
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW

        String firstName;
        String lastName;
        String domain;

        email = email.toLowerCase();

        firstName = email.substring(0, email.indexOf('_'));
        lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
        domain = email.substring(email.indexOf('@') + 1, email.indexOf('.'));

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        domain = domain.substring(0, 1).toUpperCase() + domain.substring(1).toLowerCase();

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
    }
}
