
class A3Within10 extends ConsoleProgram {

  /**
  * Description: comparing numbers to see which one is closer to 10
  * @author: Preston Wong
  */
  
  public void run() {

    // variables 
    Integer intNum1 = 0;
    Integer intNum2 = 0;

    // getting user input for the 2 numbers that we are comparing 
    intNum1 = readInt("What is your first number? ");
    intNum2 = readInt("What is your second number? ");

    // proccesse the 2 numbers and sees which one is closer to 10 then the other, or if they are the same disatnce away 
    if (Math.abs(10 - intNum1) > Math.abs(10-intNum2)) {
        System.out.println(intNum2);
    } else if (Math.abs(10-intNum1) < Math.abs(10-intNum2)) {
        System.out.println(intNum1);
    } else {
        System.out.println("0");
    }

    
  }
}