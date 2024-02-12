import java.util.*; // Scanner class for getting input

public class VILLASOR_A2_2 {
    static Scanner input = new Scanner(System.in); // Create object to take input

    public static void main(String[] args) {
        System.out.print("Enter Day of the Week:");
        int intDaysWeek = input.nextInt();

        System.out.print("Enter Hours Worked: ");
        int intHrsWorked = input.nextInt();

        input.close(); // To avoid getting resource leak

        switch (intDaysWeek) {
            case 1: // Sunday
                if (intHrsWorked > 0) { // # of hrs worked more than the req # of hrs
                    System.out.println("Overtime " + (intHrsWorked - 0) + " Hour(s)");
                } else { // worked hrs & req # of hrs has same val
                    System.out.println("Thank you for Working!");
                }
                break;
            case 2: // Monday
                if (intHrsWorked < 8) { // # of hrs worked is less than req #
                    System.out.println("Undertime " + (8 - intHrsWorked) + " Hour(s)");
                } else if (intHrsWorked > 8) { // # of hrs worked more than the req # of hrs
                    System.out.println("Overtime " + (intHrsWorked - 8) + " Hour(s)");
                } else { // worked hrs & req # of hrs has same val
                    System.out.println("Thank you for Working!");
                }
                break;
            case 3: // Tuesday
                if (intHrsWorked < 8) { // # of hrs worked is less than req #
                    System.out.println("Undertime " + (8 - intHrsWorked) + " Hour(s)");
                } else if (intHrsWorked > 8) { // # of hrs worked more than the req # of hrs
                    System.out.println("Overtime " + (intHrsWorked - 8) + " Hour(s)");
                } else { // Worked hrs & req # of hrs has same val
                    System.out.println("Thank you for Working!");
                }
                break;
            case 4: // Wednesday
                if (intHrsWorked < 8) { // # of hrs worked is less than req #
                    System.out.println("Undertime " + (8 - intHrsWorked) + " Hour(s)");
                } else if (intHrsWorked > 8) { // # of hrs worked more than the req # of hrs
                    System.out.println("Overtime " + (intHrsWorked - 8) + " Hour(s)");
                } else { // Worked hrs & req # of hrs has same val
                    System.out.println("Thank you for Working!");
                }
                break;
            case 5: // Thurday
                if (intHrsWorked < 8) { // # of hrs worked is less than req #
                    System.out.println("Undertime " + (8 - intHrsWorked) + " Hour(s)");
                } else if (intHrsWorked > 8) { // # of hrs worked more than the req # of hrs
                    System.out.println("Overtime " + (intHrsWorked - 8) + " Hour(s)");
                } else { // Worked hrs & req # of hrs has same val
                    System.out.println("Thank you for Working!");
                }
                break;
            case 6: // Friday
                if (intHrsWorked < 7) { // # of hrs worked is less than req #
                    System.out.println("Undertime " + (7 - intHrsWorked) + " Hour(s)");
                } else if (intHrsWorked > 7) { // # of hrs worked more than the req # of hrs
                    System.out.println("Overtime " + (intHrsWorked - 7) + " Hour(s)");
                } else { // Worked hrs & req # of hrs has same val
                    System.out.println("Thank you for Working!");
                }
                break;
            case 7: // Saturday
                if (intHrsWorked < 4) { // # of hrs worked is less than req #
                    System.out.println("Undertime " + (4 - intHrsWorked) + " Hour(s)");
                } else if (intHrsWorked > 4) { // # of hrs worked more than the req # of hrs
                    System.out.println("Overtime " + (intHrsWorked - 4) + " Hour(s)");
                } else { // Worked hrs & req # of hrs has same val
                    System.out.println("Thank you for Working!");
                }
                break;
            default: // User input more than 7 for days of the week
                System.out.println("INVALID DAY OF THE WEEK. Only 1-7 integers only.");
                break;
        }
    }
}