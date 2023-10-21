
class C2EveryNth extends ConsoleProgram {

  /**
  * Description: finds and removes letters in a sequence of letters in terms of i
  * @author: Preston Wong
  */
  
  public void run() {

    // variables
    String strWord;
    Integer intRemoved;
    Integer intLength;
    String strLetter;
    String strNewLetter;

    // getting user input 
    strWord = readLine("is your sequence of letters? ");
    intRemoved = readInt("What factor did you want your letters to be removed at? ");

    // calcualting the starting length of the sequence of letters 
    intLength = strWord.length();
    
    // finds which letters to remove in terms of i 
    for (int i = intRemoved; i < intLength; i++){
        strLetter = strWord.substring(i - intRemoved + 1 , i);
        intLength = strWord.length();
        strNewLetter = strWord.replace(strLetter,"" );
        strWord = strNewLetter; 
    }

    // displays the final result 
    System.out.println(strWord);

  }
}