
class C2EveryNth extends ConsoleProgram {

  /**
  * Description: Prints out every ninth number 
  * @author: Preston Wong
  */
  
  public void run() {
    
    int counter =0;

    while (counter <= 10) {
        System.out.println(counter*9);
        counter++;
    }
    
  }
}