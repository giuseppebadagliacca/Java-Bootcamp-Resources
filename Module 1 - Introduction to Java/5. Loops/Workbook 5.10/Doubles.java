public class Doubles {
    public static void main(String[] args) {

        /* Task 2
            1. Call the rollDice() function twice.
            2. Store the return values in dice1 and dice2.   

        */
        int dice1 = randomNumber();
        int dice2 = randomNumber();
        int counter = 1;

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");

        /* Task 3
            1. Set up a loop that keeps running while the two dice aren't the same.
            2. During each run, re-roll the dice and print the two values. 
         */
        while (dice1 != dice2){
            dice1 = randomNumber();
            dice2 = randomNumber();

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");
            counter++;
        }

        // Task 4: After they roll doubles, print: You rolled doubles!
        System.out.println("You rolled doubles after "+counter+" trys!");
    }


    /** Task 1 
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */
    public static int randomNumber(){
        return (int)(Math.random() * 6) + 1;
    }
}





