import java.util.*; // for Scanner, InputMismatchException, and NumberFormatException

// Class with methods to calculate user's input
class Calculator {
    // Method for Addition
    public float addition(float fltFirstNum, float fltSecondNum) {
        return (fltFirstNum + fltSecondNum);
    }

    // Method for Substraction
    public float subtraction(float fltFirstNum, float fltSecondNum) {
        return (fltFirstNum - fltSecondNum);
    }

    // Method for Multiplication
    public float multiplication(float fltFirstNum, float fltSecondNum) {
        return (fltFirstNum * fltSecondNum);
    }

    // Method for Division, won't divide 0 divisor
    public float division(float fltFirstNum, float fltSecondNum) {
        if (fltSecondNum == 0) {
            throw new ArithmeticException("Cannot divide by 0!");
        }
        return fltFirstNum / fltSecondNum;
    }
}

public class Villasor_Calculator {
    // Create object to read input
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float fltFirstNum = inputValidation("Enter first number: ");
        float fltSecondNum = inputValidation("Enter second number: ");
        int intOperation = (int) inputValidation(
                "Choose Operation: \n\t" +
                        "[1] Addition\n\t" +
                        "[2] Subtraction\n\t" +
                        "[3] Multiplication\n\t" +
                        "[4] Division\n" +
                        "Choice: ");

        input.nextLine(); // Consume newline

        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        switch (intOperation) {
            case 1:
                float intSum = calculator.addition(fltFirstNum, fltSecondNum);
                System.out.println("Addition: " + fltFirstNum + " + " + fltSecondNum + " = " + intSum);
                break;
            case 2:
                float intDifference = calculator.subtraction(fltFirstNum, fltSecondNum);
                System.out.println("Subtraction: " + fltFirstNum + " - " + fltSecondNum + " = " + intDifference);
                break;
            case 3:
                float fltProduct = calculator.multiplication(fltFirstNum, fltSecondNum);
                System.out.println("Multiplication " + fltFirstNum + " - " + fltSecondNum + " = " + fltProduct);
                break;
            case 4:
                try {
                    float intQuotient = calculator.division(fltFirstNum, fltSecondNum);
                    System.out.println("Division: " + fltFirstNum + " / " + fltSecondNum + " = " + intQuotient);
                } catch (ArithmeticException error) {
                    System.out.println("ERROR OCCURRED: " + error.getMessage());
                }
                break;
            default:
                System.out.println("INVALID CHOICE\n");
        }
    }

    // Method to check whether input is valid
    public static float inputValidation(String strGuide) {
        float fltToValidate = 0;
        boolean boolIsValid = false;

        // Continue until a valid input is entered
        do {
            try {
                System.out.print(strGuide);
                fltToValidate = input.nextFloat();
                boolIsValid = true;
            } catch (InputMismatchException error) {
                System.out.println("ERROR OCCURED: Input mismatch.\nPlease Try Again!");
                input.nextLine(); // Consume newline
            }
        } while (!boolIsValid);

        return fltToValidate;
    }
}
