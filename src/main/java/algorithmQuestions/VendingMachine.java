import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        int input, change, quarters, dimes, nickels, pennies;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter cents:");
        input = s.nextInt();
        change = 100 - input;

        s.close();
        if (change < 100 && change > 0) {
            quarters = change / 25;   // gives us the quarter amount


            pennies = change % 25; // Consider all Remainder is pennies..
            dimes = pennies / 10;  // If we divide all pennies with 10, we can reach dimes...

            pennies = pennies % 10; // Update pennies -> with the dimes aside, remainder are pennies...
            nickels = pennies / 5;  // If we divied all updated pennies with 5, we can reach to nickels

            pennies = pennies % 5; // remainder are pennies left..
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");
        } else {
            System.out.println("Invalid cents amount");
        }

    }
}
