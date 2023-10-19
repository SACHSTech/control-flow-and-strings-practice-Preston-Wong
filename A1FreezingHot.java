class A1FreezingHot extends ConsoleProgram {

  /**
  * Description Sees if the water is either boiling, frozen, or warm in temperature 
  * @author: Preston Wong
  */
  
  public void run() {
    
    Integer intTemp;
    
    // Getting user input for the temperature for their water 
    intTemp = readInt("What is your water temperature? ");

    // Sees is the water is forzen, warm, or boiling 
    if (intTemp < 0) {
        System.out.println("Your water is frozen and is now ice");
    }
    else if (intTemp > 0 && intTemp < 100) {
        System.out.println("Your water is warm but not hot");
    }
    else {
        System.out.println("Your water is boiling hot");
    }
    
  }
}
