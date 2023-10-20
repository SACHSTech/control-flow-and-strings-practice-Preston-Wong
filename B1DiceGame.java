import java.util.Random;

class B1DiceGame extends ConsoleProgram {

  /**
  * Description: Dice Game
  * @author: Preston Wong
  */
  
  public void run() {
    
    // randomizer 
    Random myRandom = new Random();
    
    // variables 
    int intRandom = myRandom.nextInt((6-1)+1)+1;
    int intGuess;

    // gets the user's first guess 
    intGuess = readInt("Guess which side the dice landed on (1-6): ");

    // determines if the number inputted is too high, low, or is correct 
    while (intGuess > intRandom) {
        // give the user a hint that their number is too high 
        System.out.println("That is too high, guess lower");
        intGuess = readInt("Guess which side the dice landed on (1-6): ");
    }
    
    while (intGuess < intRandom) {
        // gives the user a hint taht their number is too low 
        System.out.println("That is too low, guess higher ");
        intGuess = readInt("Guess which side the dice landed on (1-6): ");
    }
    System.out.println("Correct, that is the number!");
  }
}
