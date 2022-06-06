package labTasks;

public class OddOrEven {
    public static void main(String[] args) {
        solution1();
    }

    public static void solution1() {

        String oddResult = "";
        String evenResult = "";
        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                evenResult += (i + " ");


            } else if (i % 2 != 0) {

                oddResult += (i + " ");
            } else {
            }

        }
        System.out.println(evenResult.substring(0, evenResult.length() - 1));
        System.out.println(oddResult.substring(0, oddResult.length() - 1));
    }

}
/*
/*
Use a loop to print all the even numbers from 1 to 20. Print each number on the same line, with spaces between each
Use another loop to print all the odd numbers from 1 to 20. Print each number on the same line, with spaces between each
Note: In the end there will be two lines. First the line to show all the even numbers and then another line to show all the odd numbers
Main topics: loops, primitive data types, if statement, operators

Example Flow:

2 4 6 .... 18 20
1 3 5 .... 17 19
 */