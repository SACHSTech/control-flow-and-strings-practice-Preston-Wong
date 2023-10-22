
class D1GramsToPounds extends ConsoleProgram {

  /**
  * Description conversts grams to pounds in a chart 
  * @author: Preston Wong
  */
  
  public void run() {

    // variables 
    Double dblLb;

    // prints out the chart title and the underline that goes below it 
    System.out.printf("%8s %15s %n","Grams","Pounds");
    System.out.println("-------------------------------");

    // prints out the converted numbers from grams to pounds 
    for (int intG = 100; intG <= 1000; intG += 100){
        dblLb = intG * 0.00220462;
        System.out.printf("%7d %16.4f %n",intG, dblLb);
    }
  }
}