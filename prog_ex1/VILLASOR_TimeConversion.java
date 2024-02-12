import java.util.*;//for scanner class

public class VILLASOR_TimeConversion {
    static Scanner input = new Scanner(System.in);// create object that will read input

    public static void main(String[] args) {
        System.out.print("Given Time: ");
        int intGivenTime = input.nextInt();// get input hourly rate

        // display output
        System.out.println(
                "Converted Hours:" + (intGivenTime / 60) + " hour(s) " + "and " + (intGivenTime % 60) + " minutes");
    }
}
