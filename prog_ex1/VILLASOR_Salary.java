import java.util.*; // For scanner class

public class VILLASOR_Salary {
    static Scanner input = new Scanner(System.in); // Create object that will read input
    public static void main(String[] args) {
        System.out.print("Hourly Rate: ");
        double fltHrRate = input.nextDouble(); // Get input hourly rate

        System.out.print("Hours Worked: ");
        int intHrsWorked = input.nextInt(); // Get input hours worked
        System.out.println(); //Print newline
        
        // Computation of grossPay, WithHoldingTx and NetPay
        double fltGrossPay = fltHrRate * intHrsWorked;
        double fltWHoldingTax = fltGrossPay * 0.15;
        double fltNetPay = fltGrossPay - fltWHoldingTax;
        
        // Display output
        System.out.printf("Gross Pay %.3f \n", fltGrossPay);
        System.out.printf("With Holding Tax: %.3f \n", fltWHoldingTax);
        System.out.printf("Net Pay: %.3f \n", fltNetPay);
    }
    
}
