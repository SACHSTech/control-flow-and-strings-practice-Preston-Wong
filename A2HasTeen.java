
class A2HasTeen extends ConsoleProgram {

  /**
  * Description: sees if the one of the give values is a teenager or not 
  * @author: Preston Wong
  */
  
  public void run() {
    
    // variables
    Integer intAge1;
    Integer intAge2;
    Integer intAge3;
    Boolean blnTeen;

    // getting the ages of the 3 people 
    intAge1 = readInt("What is the age of the first person? ");
    intAge2 = readInt("What is the age of the second person? ");
    intAge3 = readInt("What is the age of the third person? ");

    // sees if there is a teen present or not 
    blnTeen = ((intAge1 >= 13 && intAge1 <= 19) || (intAge2 >= 13 && intAge2 <= 19) || (intAge3 >= 13 && intAge3 <= 19));

    // displays the final result as a true or false 
    System.out.println(blnTeen);
    
  }
}