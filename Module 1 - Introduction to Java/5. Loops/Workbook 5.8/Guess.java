import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */
      int secretNum = 5;
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();

        while(guess != secretNum){
            System.out.print("Try again...");
            guess = scan.nextInt();
        }

        System.out.println(guess + " is correct. You got it!");

        /* Task 2 
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '

            2. Once they guess it, print: You got it!
        */        
        scan.close();
    }

}
