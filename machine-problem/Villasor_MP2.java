 import java.util.*; // For Scanner object

public class Villasor_MP2 {
    static Scanner input = new Scanner(System.in); // Create Scanner object to take user input

    // Method to checks if the provided input is an integer
    public static int isInteger(String strInputGuide) {
        int intValidatedInput = 0;

        while (true) {
            System.out.print(strInputGuide);
            if (!input.hasNextInt()) {
                System.out.println("[ INVALID INPUT. Digits input only. ]");
                input.nextLine(); // Consume newline
            } else {
                intValidatedInput = input.nextInt();
                input.nextLine(); // Consume newline
                break;
            }
        }
        return intValidatedInput;
    }

    // Method to check if provided ID is unique
    public static boolean checkEmployeeID(int[] arrEmployeeID, int intTempID, int intIDIndex) {
        for (int i = 0;i < arrEmployeeID.length;i++) {
            if (i != intIDIndex && arrEmployeeID[i] == intTempID) 
                return true;
        } return false;
    }
    
    // Method to display employee's record
    public static void displayAllRecord(String strEmployeeName, int[] arrEmployeeID, int intIDIndex, int[] arrHrsPerDay) {
        System.out.println("\nEmployee Weekly Daily Time Record for " + strEmployeeName);
        System.out.println("Employee ID: " + arrEmployeeID[intIDIndex]);

        for (int i = 0;i < arrHrsPerDay.length;i++) {
            System.out.println("\nDay " + (i + 1) + ": ");
            System.out.println("Hours Worked: " + arrHrsPerDay[i]); 

            int intSalary = calculateDailySalary(arrHrsPerDay[i]); // Call dailySalary method
            System.out.println("Daily Salary: PHP " + intSalary);

            int intUnderTime = calculateUnderTime(arrHrsPerDay[i]); // Call underTime method
            System.out.println("Under Time: " + intUnderTime + " hours");

            int intOverTime = calculateOverTime(arrHrsPerDay[i]); // Call overTime method
            System.out.println("Over Time: " + intOverTime + " hours");
        }
        int intWeekSalary = calculateWeeklyTotalIncome(arrHrsPerDay); // Call weeklyIncome method
        System.out.println("\nWeekly Total Income: PHP " + intWeekSalary + "\n");
    }

     // Method to calculate daily salary
    public static int calculateDailySalary(int intWorkingHrs) {
        return (intWorkingHrs == 0) ? 0: (250 * intWorkingHrs);
    }

    // Method to get overtime hrs
    public static int calculateOverTime(int intWorkingHrs) {
        return (intWorkingHrs > 8) ? (intWorkingHrs - 8) : 0;
    }

    // Method to get undertime hrs
    public static int calculateUnderTime(int intWorkingHrs) {
        return (intWorkingHrs < 8) ? (8 - intWorkingHrs) : 0;
    }

    // Method to get weekly income
    public static int calculateWeeklyTotalIncome(int[] arrHrsPerDay) {
        int totalIncome = 0;

        for(int i = 0;i < 5;i++) {
            int intDailyIncome = calculateDailySalary(arrHrsPerDay[i]); // Call dailySalary method
            totalIncome += intDailyIncome ;
        } 
        return totalIncome;
    }

    // Main Method
    public static void main(String[] args) {
        int[] arrHrsPerDay = new int[5];
        int[] arrEmployeeID = new int[5];
        boolean boolIsIDUnique = true;

        System.out.println("Employee Weekly Time Record (DTR) with Daily Salary Computation\n");

        // Loop to enter five employee information 
        for (int i = 0;i < arrEmployeeID.length;i++) {
            System.out.println("====================== EMPLOYEE "+ (i + 1) + " ======================");
            System.out.print("\nEnter employee name: ");
            String strEmployeeName = input.nextLine();

            //Continue loop until unique ID is entered
           do {
                int intTempID = isInteger("Enter employee id: "); // Call isInteger method
                if (checkEmployeeID(arrEmployeeID, intTempID, i)) { // Checks if ID is unique
                    System.out.println("[ ID already in use. Please choose a different one. ]");
                    boolIsIDUnique = false;
                } else {
                    arrEmployeeID[i] = intTempID;
                    boolIsIDUnique = true;
                }
            } while (!boolIsIDUnique);
            
            // To prompt user to enter hours work per day
            for (int j = 0;j < arrHrsPerDay.length;j++) {
                arrHrsPerDay[j] = isInteger("Enter hours worked on day " + (j + 1) + ": "); // Call isInteger method
            }
            displayAllRecord(strEmployeeName, arrEmployeeID, i, arrHrsPerDay); // Call displayRecord method 
        }
        System.out.println("Finished Entering Five Employees.\nEND PROGRAM.");
    }
}