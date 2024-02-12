import java.util.*; //for Scanner, Arrays.sort, equalsIgnoreCase, Arrays.toString()

public class Sorting {
    static Scanner input = new Scanner(System.in); //create object that will read input
    public static void main(String[] args) {
        double[] dblArrNumbers = new double[10];

        System.out.println("10 elements input");
        for(int i = 0; i< dblArrNumbers.length;i++) { // enter numbers for each element
            System.out.printf("Enter %d-Element: ", i + 1);
            while (!input.hasNextDouble()) { // if not valid will prompt to enter again
                System.out.printf("INVALID INPUT. Only digits containing decimal.\nEnter %d-Element: ", i + 1);
                input.next(); // consume new line
            }
            dblArrNumbers[i] = input.nextDouble(); // assign valid input
          
        }

        input.nextLine(); //consume new line from float
        System.out.print("\nChoose sorting order [ASC or DES]: ");
        String strSortingOrder = input.nextLine(); //get choice

        if (strSortingOrder.equalsIgnoreCase("ASC")) { //accepts ASC, asc, Asc,.. input
            Arrays.sort(dblArrNumbers); //to sort in ascending order
            System.out.println(Arrays.toString(dblArrNumbers));
        } else if (strSortingOrder.equalsIgnoreCase("DES")) { //accepts DES, des, Des,.. input
            Arrays.sort(dblArrNumbers); //to sort in ascending order
            for(int i = dblArrNumbers.length - 1;i >= 0;i--) { //format in descending order
                if (i == dblArrNumbers.length - 1) { //last element of dblArrNumbers
                    System.out.printf("[%.2f, ", dblArrNumbers[i]);
                } else if (i == 0) { //first element of dblArrNumbers
                    System.out.printf(" %.2f]", dblArrNumbers[i]);
                } else {
                    System.out.printf("%.2f, ", dblArrNumbers[i]);
                }
            }
        } else { //order is not esc or des
            System.out.println("INVALID INPUT. ESC or DES only");
        }
    }
}
