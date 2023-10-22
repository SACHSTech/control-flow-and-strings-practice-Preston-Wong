class A1FreezingHot extends ConsoleProgram {

  /**
  * Description Sees if the water is either boiling or frozen in temperature 
  * @author: Preston Wong
  */
  
  public void run() {
    
    // variables 
    Integer intTemp1;
    Integer intTemp2;
    Boolean blnFrozenHot;

    // Getting user input for the temperature for their water 
    intTemp1 = readInt("What is the first temperature? ");
    intTemp2 = readInt("What is the second temperature? ");

    // sees if the temperature is frozen and hot 
    blnFrozenHot = ((intTemp1 < 0 || intTemp2 < 0 ) && (intTemp1 >= 100|| intTemp2 >= 100));

    // displays the final result 
    System.out.println(blnFrozenHot);
    
  }
}
