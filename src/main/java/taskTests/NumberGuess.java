package taskTests;

import java.util.Scanner;

/*
You’re asked to code a game. The user is asked to find a number between 1 and 100.
When the user enters a number there will be a message that mentions whether the estimated number is greater
or less than the target number, until the user finds the target number. You cannot leave the game, once started.
 */
public class NumberGuess {
    public static void main(String[] args) {

        guessNumber();

    }

    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        //  int target = 50;
        int target = (int) (Math.random() * 100);
        // System.out.println(target);
        System.out.println("Enter your estimation");
        int guess = sc.nextInt();
        int count = 1;

        while (guess != target) {
            if (guess > target) {
                System.err.println("Your estimation is greater than target number.");
            } else {
                System.err.println("Your estimation is less than target number.");
            }
            System.out.println("Re-enter your estimation : ");
            guess = sc.nextInt();
            count++;
        }

        System.out.println("Your estimation is correct at " + count + " try.");
        sc.close();
    }
}
