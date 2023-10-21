class A1FreezingHot extends ConsoleProgram {

  /**
  * Description Sees if the water is either boiling or frozen in temperature 
  * @author: Preston Wong
  */
  
  public void run() {
    
    Integer intTemp1;
    Integer intTemp2;

    // Getting user input for the temperature for their water 
    intTemp1 = readInt("What is the first temperature? ");
    intTemp2 = readInt("What is the first temperature? ");

    // Sees is the water is forzen or boiling 
    if ((intTemp1 < 0 || intTemp2 < 0 ) && (intTemp1 >= 100|| intTemp2 >= 100)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
    
    
  }
}
