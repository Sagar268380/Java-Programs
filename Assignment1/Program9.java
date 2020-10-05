class Program9
{
  public static void main(String[] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int n=sc.nextInt();
    int sum=0,n1=n;
    while(n>=9)
    {
      int temp=n;
      sum=0;
      while(temp>0)
      {
        sum+=temp%10;
        temp/=10;
      }
      n=sum;
      if(sum==1)
      System.out.print("The give no is magic no : "+n1);
    }
   if(sum==1||n==1)
   System.out.print("The given no is magic no : "+n1);
   else System.out.print("The given no is not magic no : "+n1);
  }
}
