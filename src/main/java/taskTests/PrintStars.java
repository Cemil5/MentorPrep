package taskTests;
/*
Use a loop to print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */

public class PrintStars {

    public static void main(String[] args) {
        System.out.println("printStars1() : ");
        printStars1();
        System.out.println("printStars2() : ");
        printStars2();
        System.out.println("printStars3() : ");
        printStars3();
    }

    public static void printStars1() {
        for (int i = 0; i < 8; i++) {
            System.out.println(" * * * * * * *");
        }
    }

    public static void printStars2() {
        for (int i=0; i<48; i++) {
            System.out.print("* ");
            if (i % 6 == 5) System.out.println();
        }
        System.out.println();
    }

    public static void printStars3() {
        String row = "* ".repeat(6);
        for (int i=0; i<8; i++) {
            System.out.println(row);
        }
    }


}
