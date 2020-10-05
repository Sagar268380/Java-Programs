import java.util.Scanner;
class Program6
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of N : ");
    int n=sc.nextInt();
    int sum=0,temp;
    System.out.print("Enter Values....");
    for(int i=0;i<n;i++)
    {
      temp=sc.nextInt();
      sum+=temp;
    }
    System.out.println("The Sum of given No's is : "+sum);
  }
}
