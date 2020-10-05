import java.util.Scanner;
class NthPrime
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int i=4;
    if(n==1)
    System.out.println("2");
    else if(n==2)
    System.out.println("3");
    else
      { n-=2;
        int count=0;
    while(n>count)
        {
           int m=i;
           int s=(int)Math.sqrt(i),j;
           for(j=2;j<=s;j++)
           {
                if(i%j==0)
                break;
           }
           if(j==s)
           count++;
           i=m+1;
        }
        System.out.println(i);
      }
  }
}
