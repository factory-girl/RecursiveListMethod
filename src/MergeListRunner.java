import java.util.ArrayList;


public class MergeListRunner {
	public static void main(String[] args)
	   {
	      ArrayList<Integer> list1 = new ArrayList<Integer>();
	      list1.add(2);
	      list1.add(3);
	      list1.add(5);
	      list1.add(9);
	      list1.add(22);
	      list1.add(38);
	      list1.add(56);
	      ArrayList<Integer> list2 = new ArrayList<Integer>();
	      list2.add(4);
	      list2.add(7);
	      list2.add(8);
	      list2.add(23);
	      list2.add(37);      
	      ArrayList<Integer> tempList = NumberSort.merge(list1, list2);
	      if (tempList.size() == 0)
	      {
	          System.out.println("The list is empty");
	      }
	      else
	      {
	         for (Integer i : tempList)
	         {
	            System.out.println(i);
	         }
	      }
	   }
}
