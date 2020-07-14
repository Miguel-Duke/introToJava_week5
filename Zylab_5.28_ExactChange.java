import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        /* Type your code here. */

        Scanner scan = new Scanner(System.in);

        int userAmount;
        int remainder;

        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int dollars;

        String quarter = "Quarter";
        String dime = "Dime";
        String nickel = "Nickel";
        String penny = "Penny";
        String dollar = "Dollar";

        userAmount = scan.nextInt();

        dollars = userAmount / 100;
        remainder = userAmount % 100;
        quarters = remainder / 25;
        remainder = remainder % 25;
        dimes = remainder / 10;
        remainder = remainder % 10;
        nickels = remainder / 5;
        remainder = remainder % 5;
        pennies = remainder;

        if ( dollars > 1){
            dollar = "Dollars";
        }
        if (quarters > 1){
            quarter = "Quarters";
        }
        if (dimes > 1){
            dime = "Dimes";
        }
        if (nickels > 1){
            nickel = "Nickels";
        }
        if (pennies > 1){
            penny = "Pennies";
        }

        if (dollars >= 1){
            System.out.println(dollars + " " + dollar);
        }

        if (quarters >= 1){
            System.out.println(quarters + " " + quarter);
        }
        if (dimes >= 1){
            System.out.println(dimes + " " + dime);
        }
        if (nickels >= 1){
            System.out.println(nickels + " " + nickel);
        }
        if (pennies >= 1){
            System.out.println(pennies + " " + penny);
        }

        if (userAmount <= 0){
            System.out.println("No change");
        }
    }
}

/* Passed all tests! */