import java.util.*;

public class ListMethods
{
	/**
	 * Generates a list of n consecutive numbers
	 * @param n
	 * @return tempList 
	 */
   public static ArrayList<Integer> makeList(int n)
   {	
      ArrayList<Integer> tempList = null;
      if (n <= 0)  // The smallest list we can make
      {
    	  tempList = new ArrayList<Integer>();
      }
      else        // All other size lists are created here
      {
    	  tempList = makeList(n-1);
    	  tempList.add(n);
      }
      return tempList;
   }
   /**
    * Rearranges a list in reverse order
    * @param tList
    * @return list
    */
   public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
   {
      ArrayList<Integer> list = ListMethods.deepClone(tList);
      if ((list.size() == 1) || (list.size() == 0))
      {
         return list;
      }
      else
      {
         Integer tempInt = list.remove(0);
         list = ListMethods.reverseList(list);
         list.add(tempInt);
      }
      return list;
   }
   
   /**
    * Clones an array
    * @param tList
    * @return list
    */
   public static ArrayList<Integer> deepClone(ArrayList<Integer> tList){
      ArrayList<Integer> list = new ArrayList<Integer>(); 
      for (Integer i : tList)
      {
         list.add(new Integer(i));
      }
      return list;
   }
   
   /**
    * 
    * @param list
    * @return
    */
   public static ArrayList<Integer> even(ArrayList<Integer> tList) {
	   ArrayList<Integer> list = ListMethods.deepClone(tList);
	   if ((list.size()) == 0 || (list.size() == 1)) {
		   return list;
	   }
	   else {
		   Integer tempInt = list.remove(0);
		   list.remove(0);
		   list = ListMethods.even(list);
		   list.add(0, tempInt);
	   }
	   return list;
   }
   
   public static ArrayList<Integer> odd(ArrayList<Integer> tList) {
	   ArrayList<Integer> list = ListMethods.deepClone(tList);
	   if ((list.size() == 0) || (list.size() == 1)) {
		   return new ArrayList<Integer>();
	   }
	   else {
		   list.remove(0);
		   Integer tempInt = list.remove(0);
		   list = ListMethods.odd(list);
		   list.add(0,tempInt);
	   }
	   return list;
   }

}