package labTasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("enter the radius of a circle");
            double radius = input.nextDouble();

            if (radius == 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            }

            double pi = 3.14;
            double area = pi * radius * radius;
            double perimeter = 2 * pi * radius;
            double diameter = 2 * radius;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("would you like to calculate another circle? yes/no");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("invalid answer! Would you like to calculate another circle? yes/no");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                System.out.println("thank you for using Cydeo Circle Calculator App");
                return;
            }
        }
    }
}
