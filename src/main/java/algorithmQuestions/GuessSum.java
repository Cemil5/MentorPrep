import java.util.Scanner;

public class GuessSum {
    public static void main(String[] args) {
//        int number1 = (int)(Math.random() * 10);
//        int number2 = (int)(Math.random() * 10);
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("What is " + number1 + " + " + number2 + "? ");
//
//        int sum = number1 + number2;
//        int userAnswer = input.nextInt();
//
//        while (sum != userAnswer) {
//            System.out.print("Try again.");
//            userAnswer = input.nextInt();
//        }
//
//        System.out.println("You got it!");
        guessSumDoWhile();
    }

    public static void guessSumDoWhile(){
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);

        int sum = number1 + number2;
        int userAnswer = 0;

        do {
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            userAnswer = input.nextInt();
        }while (sum != userAnswer);

        System.out.println("You got it!");

    }
}
