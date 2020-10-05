class Program8
{
  public static void main(String[] args)
  {
    for(int i=65;i<=68;i++)
    {
      for(char j=65;j<=i;j++)
      {
      System.out.print(j+" ");
       if(j==68)
       System.out.print((++j)+" ");
     }
      System.out.println();
    }
  }
}
