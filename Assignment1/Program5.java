class Program5
{
  public static void main(String[] args)
  {
    if(args.length==2)
    {
       System.out.println("The sum of two numbers is : "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
    }
    else System.out.println("Please enter correct arguments");
  }
}
