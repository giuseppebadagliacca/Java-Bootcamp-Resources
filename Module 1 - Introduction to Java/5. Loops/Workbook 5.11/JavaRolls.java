import java.util.Scanner;

public class JavaRolls {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /*
     * Task 1:
     * 1. print: Let's play Rolling Java. Type anything to start.
     * 2. Get the user to enter any value
     */
    System.out.println("Type 'start' to begin!");
    String start = scan.nextLine();

    /*
     * Task 2:
     * 1. Once the user is ready, print:
     * Great, here are the rules:\n
     * - If you roll a 6 the game stops.
     * - If you roll a 4 nothing happens.
     * - Otherwise, you get 1 point.\n
     * You must collect at least 3 points to win. Enter anything to roll:
     * 2. Get the user to enter any value
     */
    if (start.equals("start")) {
      System.out.println("Great, here are the rules:\n");
      System.out.println("- If you roll a 6 the game stops.");
      System.out.println("- If you roll a 4 nothing happens.");
      System.out.println("- Otherwise, you get 1 point.\n");
      System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
    }

    boolean checkpoint = scan.nextBoolean();

    if (checkpoint) {
      int score = 0;
      while (score < 3) {
        int roll = rollDice();
        System.out.println(" You rolled a " + roll);
        if (roll == 6) {
          System.out.println("You rolled a 6. Game over!");
          System.exit(0);
        } else if (roll == 4) {
          System.out.println("You rolled a 4. Zero points");
        } else {
          System.out.println("You rolled a " + roll + ". One point added! Keep rolling");
          score++;
        }

      }
      System.out.println("\nYour score is: " + score + ". You win!");
    } else {
      System.out.println("Dang, next time :)");
    }

    int score = 0;

    /*
     * Task 3
     * 1. Make a while loop that runs forever
     * 2. During each run, get them to enter a random value
     */

    /*
     * Task 6
     * If the user rolls a 6:
     * 1. print: End of game.
     * 2. stop the game.
     * 
     * If the user rolls a 4:
     * 1. print: Zero points. Keep rolling.
     * 
     * If the user rolls anything else:
     * 1. update the points variable by 1
     * 2. print: One point. Keep rolling.
     * 
     */

    /*
     * Task 7
     * 
     * 1. After the game ends, check the user's points.
     * 
     * System.out.println("\nYour score is: " + score);
     * 
     * 2. If the score is greater than or equal to 3, print:
     * Wow, that's lucky. You win!
     * Otherwise, print:
     * Tough luck, you lose :(
     */
  }

  /**
   * Task 4
   * Function name: rollDice – rolls a dice between 1 and 6
   * 
   * @return randomNumber (int)
   * 
   */

  public static int rollDice() {
    return (int) (Math.random() * 6) + 1;
  }
}
