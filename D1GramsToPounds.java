
class D1GramsToPounds extends ConsoleProgram {

  /**
  * Description conversts grams to pounds in a chart 
  * @author: Preston Wong
  */
  
  public void run() {

    Double dblLb;

    System.out.printf("%8S %15S %n","Grams","Pounds");
    System.out.println("-------------------------------");

    for (int intG = 100; intG <= 1000; intG += 100){
        dblLb = intG * 0.00220462;
        System.out.printf("%7d %15.2f %n",intG, dblLb);
    }
  }
}