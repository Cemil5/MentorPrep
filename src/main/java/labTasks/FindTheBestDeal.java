package labTasks;

import java.util.Scanner;
/*
Mike goes to Wallgreeps to shop for some kitchen supplies and finds out
there are several of deals available to choose :
Deal 1 - if he buys more than 3 items, each item's price will be discounted by %10     more than  50 -> deal 1
Dea1 2 - if he buys more than 3 items, there will be $5 discount in total              less than 50 -> deal 2
Dea1 3 - if the cart total is higher than $30, there will be %15 discount in total     40 * 0.15 = 6 -> deal 3
Note : Deals can not be used together
 */
public class FindTheBestDeal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int itemPrice = 5;

        //  int itemCount = 5;    // changed all itemCount to count

        System.out.println("Please select the deal you would like use");
        int dealId = scanner.nextInt();

        System.out.println("Please enter item count you would like to buy: ");
        int count = scanner.nextInt();

        int customerCartTotal = itemPrice * count;


        double amountWithSelectedDeal = 0;
        // deal1 calculations
        double amountWithDeal1 = (count > 3) ? customerCartTotal * 0.9 : customerCartTotal; // modified all 3
        // deal2 calculations
        double amountWithDeal2 = (count > 3) ? customerCartTotal - 5 : customerCartTotal;
        // deal3 calculations
        double amountWithDeal3 = (customerCartTotal > 30) ? customerCartTotal * 0.85 : customerCartTotal;  // (customerCartTotal * 100) / 15

        int advisedDealId = 1;  // 0
        double amountWithAdvisedDeal = amountWithDeal1;       // moved above, assumed deal1 is best just for the beginning


        if (dealId == 1) {
            amountWithSelectedDeal = amountWithDeal1;
        } else if (dealId == 2) {
            amountWithSelectedDeal = amountWithDeal2;
        } else {
            amountWithSelectedDeal = amountWithDeal3;
        }

        if (amountWithDeal2 < amountWithAdvisedDeal && amountWithDeal2 < amountWithDeal3 ) {
            amountWithAdvisedDeal = amountWithDeal2;
            advisedDealId = 2;
        } else if (amountWithDeal3 < amountWithAdvisedDeal && amountWithDeal3 < amountWithDeal2) {
            amountWithAdvisedDeal = amountWithDeal3;
            advisedDealId = 3;
        }

        if (dealId == advisedDealId) {
            System.out.println("You have made excellent choice");
            System.out.println("Your cart without discount: " + customerCartTotal);     // count * itemPrice
            System.out.println("Your cart with discount: " + amountWithSelectedDeal);    // customerCartTotal
        } else {
            System.out.println("There is an another deal option for you. dealId: " + advisedDealId);
            System.out.println("If you still would like to use dealId: " + dealId + " price will be " + amountWithSelectedDeal);
            System.out.println("If you use our advice  dealId: " + advisedDealId + " price will be " + amountWithAdvisedDeal);
        }
    }
}
