public class PermutationCounterTester
{
   public static void main(String[] args)
   {
      PermutationCounter counter = new PermutationCounter(5);
      System.out.println(counter.getCount());
      System.out.println("Expected: 120");
   }
}