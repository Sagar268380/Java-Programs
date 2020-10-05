import java.util.Scanner;
class Program3
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter Integer : ");
    int n=in.nextInt();
    System.out.println("The Given Integer is "+n);
    System.out.print("Enter Float : ");
    float n1=in.nextFloat();
    System.out.println("The Given Float is "+n1);
    System.out.print("Enter Char : ");
    char n2=in.next().charAt(0);
    System.out.println("The Given Character is "+n2);
    System.out.print("Enter String : ");
    String n3=in.next();
    System.out.println("The Given String is "+n3);
  }
}
