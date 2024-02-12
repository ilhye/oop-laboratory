import java.util.*; //for Scanner 

public class OddEvenTotalSum {
    static Scanner input = new Scanner(System.in); //create object that will read input
    public static void main(String[] args){
        int[] arrNumbers = new int[10];
        int intCountEven = 0, intSumEven = 0, intCountOdd = 0, intSumOdd = 0;

        System.out.println("Enter 10 elements");
        for(int i = 0; i< arrNumbers.length;i++) { //iterate over the length to enter element
            System.out.printf("\tEnter %d-Element: ", i + 1);
            arrNumbers[i] = input.nextInt();
        }

        for(int j = 0;j < arrNumbers.length;j++) { //iterate over the loop
            if ((arrNumbers[j]%2) == 0) { //check if its even
                intSumEven+=arrNumbers[j];
                intCountEven++;
            } else { //odd number
                intSumOdd+=arrNumbers[j];
                intCountOdd++;
            }
        }
        System.out.println("\nTotal number of Odd: "+ intCountOdd + "\nSum of Odd: " + intSumOdd);
        System.out.print("Total number of Even: " + intCountEven + "\nSum of Even: " + intSumEven);
    }
}
