package taskTests;

import java.util.Scanner;

/*
Create a class named DivisibleBy and Write a program that can print the numbers between 1 ~ N that can be
divisible by 3, 5, and 15.
	            if the number can be divisible by 3, 5 and 15,
	                then it should only be displayed in DivisibelBy15' section

	            if the number can be divisible by 3 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy3' section

	            if the number can be divisible by 5 but cannot be divisible by 15,
	                then it should only be displayed in DivisibelBy5' section

	            EX:
	                input: 100

	                Output:
	                     Divisible By 15: 15 30 45 60 75 90

	                     Divisible By 5:  5 10 20 25 35 40 50 55 65 70 80 85 95 100

	                     Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */

public class DivisibleBy {

    public static void main(String[] args) {

        long l = 1000000000000000000L;
        float f = 10;
        System.out.println(f);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0 && i % 5 == 0 && i % 3 == 0) {
                divisibleBy15 += " " + i;
            } else if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5 += " " + i;
            } else if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3 += " " + i;
            }

        }
        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);
        input.close();
    }

    public static void div2() {
        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();
        String div5 = "",
                div3 = "",
                div15 = "";

        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                div15 += i + " ";
            } else if (i % 3 == 0) {
                div3 += i + " ";
            } else if (i % 5 == 0) {
                div5 += i + " ";
            } else {
                continue;
            }
        }

        System.out.println("Divisible by 15: " + div15 + "\nDivisible by 5: "
                + div5 + "\nDivisible by 3: " + div3);
    }
}

