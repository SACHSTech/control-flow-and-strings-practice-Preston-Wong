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
    for (int Counter = 1; Counter <= 5; Counter++){
      if (Counter == 5) {
        System.out.println("Nice Try ");
        
      } else if (intGuess < intRandom) {
        System.out.println("That is too low, try again");
        intGuess = readInt("Guess a number between 0 - 100: ");

      } else if (intGuess > intRandom) {
        System.out.println("That is too high, try again");
        intGuess = readInt("Guess a number between 0 - 100: ");

      } else if (intGuess == intRandom){
        System.out.println("That is correct!");
        break;
      }
    }
  }
}


