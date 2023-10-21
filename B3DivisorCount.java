
class B3DivisorCount extends ConsoleProgram {

  /**
  * Description: prints out all the divisors of a number inputted by the user 
  * @author: Preston Wong
  */
  
  public void run() {

    // variables
    Integer intNumber;

    // getting the user's number that they want to know the possible divisors of 
    intNumber = readInt("What is your number? ");

    
    System.out.println("The divisors of " + intNumber + " are: ");

    // calculates and displays the divisors of the number set by the user 
    for (int i = 1; i <= intNumber; i++){
        if (intNumber % i == 0){
            System.out.println(i);
        }
    }
  }
}