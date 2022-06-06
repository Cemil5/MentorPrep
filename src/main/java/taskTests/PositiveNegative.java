package taskTests;

import java.util.Scanner;

public class PositiveNegative {

    public static void solution1() {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please, enter positive or negative number:");
            num = input.nextInt();
            if (num >= 0) {
                num = 1;
                positive += num;
                continue;
            } else {
                num = 1;
                negative += num;
                continue;
            }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        input.close();
    }

    public static void solution2() {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("enter  num:");
            int num = input.nextInt(); // 10 20 -1 0 3

            if (num > 0 && num != 0) {
                positive += i - (i - 1);
            } else if (num < 0 && num != 0) {
                negative += i - (i - 1);
            }
        }
        System.out.println("positive numbers = " + positive);
        System.out.println("negative numbers = " + negative);
    }

    public static void solution3() {

        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > 0) {
                positive += 1;
            } else if (num == 0) {
                zero += 1;
            } else {
                negative += 1;
            }
        }

        System.out.println(positive + " positive " + "and " + negative + " negative");

        input.close();
    }


/*
2. Create a class named PositiveNegative and write a program that asks user
to enter number for 5 times, and print how many positive and negative numbers user entered
            Ex:
                Inputs:
                    10
                    20
                    -1
                    0
                    3

                Output:
                    3 positive and 1 negative

 */
}
