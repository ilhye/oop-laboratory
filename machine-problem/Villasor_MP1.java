import java.util.*;

public class Villasor_MP1 {
    static Scanner input = new Scanner(System.in); // Create object that will read input

    // Method to reverse a string
    public static String stringReversal(String strToReverse) {
        StringBuilder strReverse = new StringBuilder(); // Create new StringBuilder 

        strReverse.append(strToReverse); // Add character sequence in strReverse from strToReverse 
        strReverse.reverse(); // Reverse string

        return strReverse.toString(); // Return converted reverse string
    }

    // Method to check if strign is a palindrome
    public static boolean palindromeChecker(String strToCheckPalindrome) {
        String strCheckPalindrome = spaceRemover(strToCheckPalindrome); // Call spaceRemover method to remove its spaces
        String strInverse = stringReversal(strCheckPalindrome); // Reverse it

        // Checks whether original and reverse string is read the same
        if (strCheckPalindrome.length() == strInverse.length()) { 
            return strCheckPalindrome.equals(strInverse);
        } else { 
            return false;
        }
    }

    // Method to determing whether two string are anagram
    public static boolean anagramChecker(String strFirstSen, String strSecondSen) {
         // Remove spaces of 1st and 2nd string
        String strFirstNoSpace = spaceRemover(strFirstSen); 
        String strSecondNoSpace = spaceRemover(strSecondSen); 
        
        // Check if 1st and 2nd character sequence are the same
        if (strFirstNoSpace.length() == strSecondNoSpace.length()) {
            char[] charConvertFirst = strFirstNoSpace.toCharArray(); 
            char[] charConvertSecond = strSecondNoSpace.toCharArray(); 

            Arrays.sort(charConvertFirst); 
            Arrays.sort(charConvertSecond); 

            return Arrays.equals(charConvertFirst, charConvertSecond);
        } else {
            return false;
        }
    }

    // Method to count word in the string
    public static int wordCount(String strWordToCount) {
        int intCountWords = strWordToCount.split("[\\s.]+").length; 
        return intCountWords;
    }

    // Method to count character in the string
    public static int characterCount(String strToCountChar) {
        int intCharCount = spaceRemover(strToCountChar).length(); 
        return intCharCount;
    }

    // Method to find all substring occurences
    public static int substringFinder(String strToFind, String strInfo) {
        int intOccurences = 0;
       
        // Iteration to get begin and last index of substring
        for (int i = 0;i < strInfo.length();i++) {
            for (int j = i + 1;j <= strInfo.length();j++) { 
                if (strInfo.substring(i, j).equals(strToFind))  
                    intOccurences++; 
            }
        }
        return intOccurences;
    }

    // Method to convert uppercase into lowercase string
    public static String lowerCaseConverter(String strToLower) {
        String strLowerCase = strToLower.toLowerCase(); 
        return strLowerCase;
    }

    // Method to convert lowercase into upper case string
    public static String upperCaseConverter(String strToUpper) {
        String strUpperCase = strToUpper.toUpperCase(); 
        return strUpperCase;
    }

    // Method to remove vowels
    public static String vowelRemover(String strWithVowel) {
        String strRemovedVowel = strWithVowel.replaceAll("[aeiouAEIOU]", ""); 
        return strRemovedVowel;
    }

    // Method to remove consonants
    public static String consonantRemover(String strWithConsonant) {
        String strRemovedConsonant = strWithConsonant.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", "");
        return strRemovedConsonant;
    }

    // Method to remove spaces
    public static String spaceRemover(String strToModify) {
        String strRevised = strToModify.replaceAll("\\s+", ""); 
        return strRevised;
    }

    // Method to ask user if they want to try again
    public static boolean continueUse() {
        // Continue loop if input is invalid
        while (true) {
            System.out.print("\nDo you want to try again?\nPress [Y] Yes or [N] No: ");
            String strTryAgain = input.nextLine();

            // Checks whether input y/Y or n/N or random word
            if (strTryAgain.equalsIgnoreCase("Y")) { 
                return true;
            } else if (strTryAgain.equalsIgnoreCase("N")) { 
                return false;
            } else { 
                System.out.println("INVALID INPUT. Only [Y/y] or [N/n]." );
            }
        } 
    }

    //Main method
    public static void main(String[] args) {
        boolean boolTryAgain = false; 
        int intChoice;

        do {
            System.out.println("======= CHOOSE A STRING MANIPULATION =======");
            System.out.println("[1] String Reversal");
            System.out.println("[2] Palindrome Checker");
            System.out.println("[3] Anagram Checker");
            System.out.println("[4] Word Count");
            System.out.println("[5] Character Count");
            System.out.println("[6] Substring Finder");
            System.out.println("[7] Lower Case Converter");
            System.out.println("[8] Upper Case Converter");
            System.out.println("[9] Vowel Remover");
            System.out.println("[10] Consonant Remover");

            // Continue loop until choice is more than or less than 10 or not integer 
            do { 
                System.out.print("Choice [1 to 10 only]: ");
                while (!input.hasNextInt() || (intChoice = input.nextInt()) < 1 || intChoice > 10) {
                    System.out.print("INVALID INPUT. Input between 1-10 only.\nChoice: ");
                    input.nextLine(); // Consume newline
                }
            } while (intChoice < 1 || intChoice > 10);

            input.nextLine(); // Consume newline
            
            System.out.print("Enter three sentences: ");
            String strSentence = input.nextLine(); 

            // Process string input depending on the choice
            switch (intChoice) { 
                case 1: // String reversal
                    String strBackwards = stringReversal(strSentence); // Call stringReversal method

                    System.out.println("Reversed String: " + strBackwards);
                    break;
                case 2: // Palindrome checker
                    Boolean boolIsPalindrome = palindromeChecker(strSentence); // Call palindromeChecker method

                    if (boolIsPalindrome) {
                        System.out.println("The string is a PALINDROME");
                    } else { 
                        System.out.println("The string is NOT a PALINDROME");
                    }
                    break;
                case 3: // Anagram checker
                    System.out.print("Enter second sentence: ");
                    String strCompareAnagram = input.nextLine(); 

                    Boolean boolIsAnagram = anagramChecker(strSentence, strCompareAnagram); // Call anagramChecker method

                    if (boolIsAnagram) { 
                        System.out.println("The " + strSentence +" and " + strCompareAnagram + " are ANAGRAM");
                    } else { 
                        System.out.println("The two strings are NOT ANAGRAM.");
                    }
                    break;
                case 4: // Word count
                    int intWords = wordCount(strSentence); // Call wordCount method
                    System.out.println("Word Count: " + intWords);
                    break;
                case 5: // Character count
                    int intCountChar = characterCount(strSentence); // Call characterCount method
                    System.out.println("Character Count (no spaces): " + intCountChar);
                    break;
                case 6: // Substring finder
                    System.out.print("Enter a substring: ");
                    String strFind = input.nextLine(); 

                    int intSubstringFound = substringFinder(strFind,strSentence); // Call substringFinder method

                    if (intSubstringFound != 0) { 
                        System.out.println("Occurence of Substring: " + intSubstringFound);
                    } else { 
                        System.out.println("Substring NOT FOUND");
                    }
                    break;
                case 7: // Lowercase converter
                    String strIsLower = lowerCaseConverter(strSentence); // Call lowerCaseConverter method
                    System.out.println("Lower Case Sentence: " + strIsLower);
                    break;
                case 8: // Uppercase converter
                    String strIsUpper = upperCaseConverter(strSentence); // Call upperCaseConverter method
                    System.out.println("Upper Case Sentence: " + strIsUpper);
                    break;
                case 9: // Vowel remover
                    String strNoVowel = vowelRemover(strSentence); // Call vowelRemover method
                    System.out.println("Without Vowel: " + strNoVowel);
                    break;
                case 10: //Consonant remover
                    String strNoConsonant = consonantRemover(strSentence); // Call consonantRemover method
                    System.out.println("Without consonant: " + strNoConsonant);
                    break;
            }
            boolTryAgain = continueUse(); // Process is finish ask user to try again
        } while (boolTryAgain);  // User wants to try again
        System.out.println("Thank you for using String Manipulation Toolkit"); // User does not want to try again
    }
}