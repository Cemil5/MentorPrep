package taskTests;

import java.util.Scanner;

/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to
                have three attempts to enter correct credentials and if all three attempts are failed,
                then print "Your account is locked."
 */
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = input.next();
        System.out.println("Enter password: ");
        String password = input.next();

        while (!(username.equals("Cydeo") && password.equals("Cydeo123"))) {
            System.out.println("Invalid username or password");
            System.out.println("Enter username");
            username = input.next();
            System.out.println("Enter password");
            password = input.next();
        }

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("loged in");
        } else {
            System.out.println("Temporary blocked");
        }
        input.close();
    }

    public static void login2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = input.next();

        System.out.println("Enter password");
        String password = input.next();
        String result = "Logged in";

        for (int i = 0; i < 3; i++) {
            if (!(userName.equals("Cydeo") && password.equals("Cydeo123"))) {
                System.err.println("Wrong input, please re-enter");
                userName = input.next();
                password = input.next();
                if ((userName.equals("Cydeo") && password.equals("Cydeo123"))) {
                    result = "Logged in";
                    break;
                } else {
                    result = "Your account is blocked";
                }
            }
        }

        System.out.println(result);

    }
}
