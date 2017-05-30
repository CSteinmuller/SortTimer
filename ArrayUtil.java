
package SortTimer;
import java.util.Random;
/**
    @file ArrayUtil.java
    @author Christopher Steinmuller
    @date 2008-3-12
    Description: Provides array utilities
    Course: CSC1351.01
    Logon ID: cstein1
    Project #: 3
    Instructor: Duncan
*/

public class ArrayUtil {
   /**
    * Creates an array of integers in Ascending or Descending order
    * @param length-length of the array
    * @param scale-whether it is ascending or descending
    * @return the filled array
    */
   public static int[] logIntArray(int length, int scale)
   {
      int[] a = new int[length] ;
      a[0] = 0;
      int j=0;
      while(j<length)
      {
         a[j] = (int) (scale * (Math.log(j) / Math.log(2)));
         j++;
      }
      return a;
   }
   
   /**
    * Creates an array of random integers
    * @param length- length of the array
    * @param n - max number
    * @return- the full array
    */
   public static int[] randomIntArray(int length, int n)
   {
      int i=0;
      int[] a = new int[length];
      while (i <a.length)
      {
         a[i] = generator.nextInt(n);
         i++;
      }
      return a;
   }
   
   private static Random generator = new Random();
}
