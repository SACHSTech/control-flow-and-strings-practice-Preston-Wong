import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
  * Description: Guessing Game
  * @author: Preston Wong
  */
  
  public void run() {
    
    // randomizer 
    Random myRandom = new Random();

    // variables 
    Integer intRandom = myRandom.nextInt((100-0)+1);
    Integer intGuess;

    // get the user's first input 
    intGuess = readInt("Guess a number between 0 - 100: ");

    // checks to see if the user's guess is too high, too low, or on point
    while (intGuess > intRandom) {
        System.out.println("That is too high, try again");
        intGuess = readInt("Guess a number between 0 - 100: ");
    }
    while (intGuess < intRandom) {
        System.out.println("That is too low, try again");
        intGuess = readInt("Guess a number between 0 - 100: ");
    }
    System.out.println("Congrates, you guessed the right number");

  }
}

