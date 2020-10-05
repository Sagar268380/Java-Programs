class Program7
{
  public static void main(String[] args)
  {
    int k;
      for(int i=1;i<=4;i++)
      {
        for(int j=1;j<=4-i;j++)
        System.out.print("  ");
        for(k=1;k<=i;k++)
        System.out.print(k+" ");
        k--;
        if(k==i)
        {
          for(int j=k-1;j>=1;j--)
          System.out.print(j+" ");
        }
        System.out.println();
      }
  }
}
