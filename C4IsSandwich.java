
class C4IsSandwich extends ConsoleProgram {

  /**
  * Description
  * @author: Preston Wong
  */
  
  public void run() {

    String strSandwich;
    Integer intBread1;
    Integer intBread2;
    
    // gets user input about their sandwich
    strSandwich = readLine("please input that your sandwich has in it (no spaces): ");

    // locates the starting position of the first and second instance of the word bread 
    intBread1 = strSandwich.indexOf("bread");

    // + 5 in from the first word to prevent it from locating the same instance
    intBread2 = strSandwich.indexOf("bread", (intBread1 + 5));

    // sees if there are 2 peices of bread present from the user input and displays the filling inside it if it is a sandwich
    if (intBread1 < intBread2){
        System.out.println(strSandwich.substring(intBread1 + 5, intBread2));
    } else {
        System.out.println("That not a sandwich, there's only one peice of bread.");
    }
    
    
  }
}