class Test1
{
  final void m1()
  {
    System.out.println("Final");
  }
  void m1(int a)
  {
    System.out.print("non - final "+a);
  }
}
class B extends Test1
{
/*  void m1()
  {
    System.out.println("Final B ");
  }*/
  void m1(int a)
  {
    System.out.println(" non - Final");
  }
}
class Test
{
  public static void main(String[] args) {
    B a=new B();
    a.m1();
    a.m1(10);
  }
}
