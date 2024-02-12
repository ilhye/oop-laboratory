import java.util.*; //for Scanner class

public class Sentence {
    static Scanner input = new Scanner(System.in); // create object that will read input
    public static void main(String[] args) {
        System.out.print("Enter sentence: ");
        String strSentence = input.nextLine(); // get sentence
        
        // replace all punctuations with an empty string and split sentence by spaces
        String[] arrWithoutPunctuation = strSentence.replaceAll("[.,;:?!'@#*()]", "").split("\\s+");

        System.out.print("\nChoose sorting order [ASC or DES]: ");
        String strSortingOrder = input.nextLine();

        if (strSortingOrder.equalsIgnoreCase("ASC")) { // accepts ESC, esc, Esc,.. input
            for (int i = 1; i < arrWithoutPunctuation.length; i++) {
                String strTemp = arrWithoutPunctuation[i];
                int intCounterAsc = i - 1;
                while (intCounterAsc >= 0 && strTemp.length() < arrWithoutPunctuation[intCounterAsc].length()) {
                    arrWithoutPunctuation[intCounterAsc + 1] = arrWithoutPunctuation[intCounterAsc]; // shift element to the right
                    intCounterAsc--;
                }
                arrWithoutPunctuation[intCounterAsc + 1] = strTemp; // insert temp string to ist correct position
            }
            System.out.print("Sentence in ascending order: ");
            for (int i = 0; i < arrWithoutPunctuation.length; i++) {  // print in ascending order
                    System.out.printf(" %s ", arrWithoutPunctuation[i]);
                }
            }
        else if (strSortingOrder.equalsIgnoreCase("DES")) {
            for (int i = 1; i < arrWithoutPunctuation.length; i++) {
                String strTemp = arrWithoutPunctuation[i];
                int intCounterDes = i - 1;
                while (intCounterDes >= 0 && strTemp.length() > arrWithoutPunctuation[intCounterDes].length()) {
                    arrWithoutPunctuation[intCounterDes + 1] = arrWithoutPunctuation[intCounterDes]; // shift element to the right
                    intCounterDes--;
                }
                arrWithoutPunctuation[intCounterDes + 1] = strTemp; // insert temp string to ist correct position
            }

            System.out.print("Sentence in descending order: ");
            for (int i = 0; i < arrWithoutPunctuation.length; i++) { //print in descending order
                System.out.printf(" %s ", arrWithoutPunctuation[i]);
            }
        }
    }
}
    

