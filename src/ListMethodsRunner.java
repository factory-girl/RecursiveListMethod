import java.util.ArrayList;

public class ListMethodsRunner
{
   public static void main(String[] args)
   {
      ArrayList<Integer> tempList = ListMethods.makeList(10);
      tempList = ListMethods.odd(tempList);
      for (Integer i : tempList)
      {
         System.out.println(i);
      }
           
   }	
}