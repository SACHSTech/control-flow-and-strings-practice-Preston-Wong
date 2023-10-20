import java.util.Random;

class B1DiceGame extends ConsoleProgram {

  /**
  * Description: Dice Game
  * @author: Preston Wong
  */
  
  public void run() {
    
    Random myRandom = new Random();
    
    int intRandom = myRandom.nextInt((6-1)+1)+1;
    int intGuess;

    intGuess = readInt("Guess which side the dice landed on (1-6): ");

    while (intGuess > intRandom) {
        System.out.println("That is too high, guess lower");
        intGuess = readInt("Guess which side the dice landed on (1-6): ");
    }
    
    while (intGuess < intRandom) {
        System.out.println("That is too low, guess higher ");
        intGuess = readInt("Guess which side the dice landed on (1-6): ");
    }
    System.out.println("Correct, that is the number!");
  }
}
