import java.util.Arrays;

public class Receipt {
    public static void main(String[] args) {

        // Task 1: Create two arrays (see Workbook article)
        String[] appleTypes = { "Gala", "Granny Smith", "Macintosh" };
        double[] applePrices = { .99, 1.49, 1.29 };

        System.out.println("\nHere's your receipt:\n");

        /*
         * Task 2
         * Use a for loop to print each apple and the corresponding price.
         * 
         * for {
         * println(\t<apple i >: $<price i >)
         * }
         */
        for (int i = 0; i < appleTypes.length; i++) {
            System.out.println("\n" + appleTypes[i] + ": $" + applePrices[i] + "");
        }
        System.out.println("");
    }
}