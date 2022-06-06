public class DigitsSum {

    public static void main(String[] args) {

        int number = 29814; // 2 + 9 + 8 + 1 + 4 = 24

        int digit1 = number % 10;
        System.out.println("digit1 = " + digit1);
        int digit2 = (number % 100) / 10;
        System.out.println("digit2 = " + digit2);
        int digit3 = (number % 1000) / 100;
        System.out.println("digit3 = " + digit3);
        int digit4 = (number % 10000) / 1000;
        System.out.println("digit4 = " + digit4);
        int digit5 = (number % 100000) / 10000;
        System.out.println("digit5 = " + digit5);


        int result = digit1 + digit2 + digit3 + digit4 + digit5;
        System.out.println("Result is: " + result);
    }
}
