
class C1BackToBack extends ConsoleProgram {

  /**
  * Description: take the last letter of the inputted word and places at the start and end of the word 
  * @author: Preston Wong
  */
  
  public void run() {
    
    // variabels 
    String strWord;
    Integer intLength;
    String strLetter; 

    // get user input 
    strWord = readLine("What is your word? ");

    // determines what the last letter is 
    intLength = strWord.length();
    strLetter = strWord.substring(intLength - 1);

    // outputs final results 
    System.out.println(strWord + " becomes ");
    System.out.println(strLetter + strWord + strLetter);
  }
}