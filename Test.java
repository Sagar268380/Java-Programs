class Test
{
   public static void main(String args[])
   {
      java.util.Scanner sc=new java.util.Scanner(System.in);
      String s=sc.next();
      isParsable(s);
   }
   public static boolean isParsable(String input){
     try{
        Integer.parseInt(input);
        return true;
      }
      catch(Exception e)
      {
        System.out.println(e);
        return false;
      }
    }
}
