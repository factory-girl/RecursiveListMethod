public class PermutationCounter
{
   private int n;

   public PermutationCounter(int numberOfItems)
   {
      n = numberOfItems;
   }
   
   public long getCount()
   {
      if (n == 0 || n == 1) {
    	  return n;
      }
      else { 
    	  PermutationCounter smallerCounter = new PermutationCounter(n - 1);
    	  return n * smallerCounter.getCount();
      }
   }
   
   public long getCountLoop() 
   {
      long r = 1;
      for (int i = 2; i <= n; i++)
         r = r * i;
      return r;
   }
}