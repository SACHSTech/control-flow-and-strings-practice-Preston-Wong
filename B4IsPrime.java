
class B4IsPrime extends ConsoleProgram {

  /**
  * Description: sees if the number inputted is a compositve or a prime number 
  * @author: Preston Wong
  */
  
  public void run() {
    
    // the variables that holds the users number 
    Integer intNumber;

    // counts to see how many divosors the number inputted has 
    Integer intDivisors = 0;

    // asks the user for the number they want to see is a or is not a prime number 
    intNumber = readInt("What is your number? ");

    // calculates the possible divisors and the number of them 
     for (int i = 1; i <= intNumber; i++){
        if (intNumber % i == 0){
            intDivisors++;
        }
    }
    
    // checks to see if the number inputted is a prime number or not and displays it 
    if (intDivisors > 2) {
        System.out.println("Your number is not a prime number becuase " + intNumber + " has more then 2 divisors.");
    } else {
        System.out.println("Your number is a prime number becuase " + intNumber + " can only be dvided by 1 and itself.");
    }

  }
}   