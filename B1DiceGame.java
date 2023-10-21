import java.util.Random;

class B1DiceGame extends ConsoleProgram {

  /**
  * Description: Dice Game
  * @author: Preston Wong
  */
  
  public void run() {
    
    // randomizer 
    Random myRandom = new Random();
    
    // rolls the number 100 times 
    for (int i = 0; i <= 100; i++){

      // variables for the randomizer 
      int intDice1 = myRandom.nextInt((6-1)+1)+1;
      int intDice2 = myRandom.nextInt((6-1)+1)+1;

      // sees if the sum of the 2 random numbers are equal to 7 or 2
      if ((intDice1 + intDice2) == 7) {
        System.out.println("lucky seven");
      }
      else if ((intDice1 + intDice2) == 2) {
        System.out.println("snaeks eyes!");
      }
    }


   
  }
}
