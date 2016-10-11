import java.util.ArrayList;

/* Class that receives multiple lists of numbers and returns one
 * numerically-ordered list.
 */
public class NumberSort {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	public static ArrayList<Integer> merge(ArrayList<Integer> givenList1, ArrayList<Integer> givenList2)
	{
	   ArrayList<Integer> list1 = givenList1;
	   ArrayList<Integer> list2 = givenList2;
	   ArrayList<Integer> sortedList;
	   
	   if (list1.size() == 0)
	   {
	      return list2;
	   }
	   else if (list2.size() == 0)
	   {
	      return list1;
	   }
	   else
	   { 
	      Integer lastElement1 = list1.get(list1.size() - 1);
	      Integer lastElement2 = list2.get(list2.size() - 1);
	      if (lastElement1.compareTo(lastElement2) < 0)
	      {
	         // Remove the largest element in either list 
	         lastElement2 = list2.remove(list2.size() - 1);
	         // Now merge the lists recursively
	         sortedList = NumberSort.merge(list1, list2);
	         // Add back the largest element
	         sortedList.add(lastElement2);
	      }
	      else
	      {
	         // Remove the largest element in either list 
	         lastElement1 = list1.remove(list1.size() - 1);
	         // Now merge the lists recursively
	         sortedList = NumberSort.merge(list1,list2);
	         // Add back the largest element
	         sortedList.add(lastElement1);
	      }            
	   }  
	   return sortedList;
	}
  
}
