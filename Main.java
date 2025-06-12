class Anywhere{
  private int a;

  void fun1()
  {
    a=2;
    System.out.println("fun1");
    System.out.println(a);
  }
}


class Everywhere{
  static int b;

  static void fun2()
  {
    System.out.println("fun2");
  }
}


class Main
{

  //  int x=5;

  public static void main(String[] args) {
    //  int x=5;

    System.out.println("Hello World");
    Anywhere nonStatic=new Anywhere();
// 		nonStatic.a=4;
    nonStatic.fun1();
// 		System.out.println(nonStatic.a);
// 		Anywhere.fun1();
    Everywhere.fun2();
// 		System.out.println(x);
  }
}
