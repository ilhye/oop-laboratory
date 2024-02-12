import java.util.*; // for scanner class

public class VILLASOR_Denomination {
    static Scanner input = new Scanner(System.in); // create object that will read input

    public static void main(String[] args) {
        int[] arrBills = { 1000, 500, 100, 50, 20, 10, 5, 1 }; // bills for converting cash on hand

        System.out.print("Cash on Hand: ");
        int intCashOnHand = input.nextInt(); // get input

        System.out.println("Denominations: ");

        // to determine the amount of money in a single bill
        for (int i = 0; i < arrBills.length; i++) {
            System.out.println("\t" + arrBills[i] + " - " + (intCashOnHand / arrBills[i]));
            intCashOnHand %= arrBills[i]; // Left cash on hand
        }
    }
}
