
class C3MiddleAbc extends ConsoleProgram {

  /**
  * Description sees if the occurence ABC happens in the middle of a word 
  * @author: Preston Wong
  */
  
  public void run() {
    
    // variable 
    String strWord;
    
    // getting the user input for this sequence of letters 
    strWord = readLine("What is your sequence of letters? ");

    // using string methods to find the length of the word and where abc is within that word 
    int intLength = strWord.length();
    int intABC = strWord.indexOf("abc");

    // processes to see if the term abc is in the middle of the sequcne of letters or not 
    if (intABC > (intLength - (intABC + 2)) || intABC < (intLength - (intABC + 4))) {
        System.out.println("ABC is not in the middle of the word ");
    } else {
        System.out.println("ABC is in the middle of the word");
    }



  }
}