import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        int year = scan.nextInt();
        boolean isLeap;

        if(year % 4 == 0){  // 2000

            if( year % 100 == 0){

                isLeap = year % 400 == 0;
            } else {
                isLeap = true;
            }

        } else {
            isLeap = false;
        }

        if(isLeap)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}
