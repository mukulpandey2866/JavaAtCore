public class Wrap {

  public static void main(String[] args) {
    int x = Integer.parseInt("1011", 2);    // static method called by class name
    Integer i1 = Integer.valueOf("1011", 2);  // static method called by class name
    int y = i1.intValue();          // non-static method called by object name of that class
    System.out.println(x);
    System.out.println(y);
    System.out.println(i1);

    Double d1 = Double.valueOf("314");  // static method called by class name
    double d2 = d1.doubleValue();        // non-static method called by object name of that class
    System.out.println(d1);


  }

}
