import java.util.*; //for concat, replaceAll and Scanner class

public class Concatenation {
    static Scanner input = new Scanner(System.in); //create object that will read input
    public static void main(String[] args) {
        System.out.print("Enter first string: ");
        String strFirst = input.nextLine(); //get first string input

        System.out.print("Enter second string: ");
        String strSecond = input.nextLine(); //get second string input

        String strFirstSecond = strFirst.concat(strSecond); //concatenate the two string input
        String strRemovedVowel = strFirstSecond.replaceAll("[aeiouAEIOU]", "*"); //remove all vowel using replaceAll String method

        System.out.println("Concatenate String: " + strFirstSecond);
        System.out.println("Vowel removed: " + strRemovedVowel);
    }
}
