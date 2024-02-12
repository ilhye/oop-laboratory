import java.util.Arrays; // for array class

public class VILLASOR_ArrABCD {
    public static void main(String[] args) {
        int[] arrN = {33,2,70,4,52,42,8,35,9,211};

        System.out.println("(a) Separate all odd from even numbers");
        System.out.print("\tOdd: ");
        for(int i = 0;i < arrN.length;i++){ // odd number: 33, 35, 9, 211
            System.out.print((arrN[i] % 2 != 0) ? arrN[i] + " " : "");
        }

        System.out.println(); // print newline

        System.out.print("\tEven: ");
        for(int j = 0;j < arrN.length;j++) { // even num: 2, 70, 4, 52, 42, 8
            System.out.print((arrN[j] % 2 == 0) ? arrN[j] + " " : "");
        }

        int intHighestNum = arrN[0]; int intLowestNum = arrN[0];
        
        for(int h = 0; h < arrN.length;h++){ // compare array to get the lowest and highest num
            intHighestNum = (intHighestNum <= arrN[h]) ? arrN[h] : intHighestNum; // high = 211
            intLowestNum = (intLowestNum >= arrN[h]) ? arrN[h] : intLowestNum; // low = 2
        }

        Arrays.sort(arrN); // sort in ascending order

        System.out.println("\n(b) Display the highest number (without sorting)\n\tHighest Number: " + intHighestNum);
        System.out.println("(c) Display the lowest number (without sorting)\n\tLowest Number: " + intLowestNum );
        System.out.println("(d) Sort the numbers in ascending order\n\tAscending Order: " + Arrays.toString(arrN));
    }
}
