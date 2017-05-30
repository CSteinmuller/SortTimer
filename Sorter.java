

package SortTimer;

/**
    @file Sorter.java
    @author Christopher Steinmuller
    @date 2008-3-12
    Description: Source for sorting algorithms
    Course: CSC1351.01
    Logon ID: cstein1
    Project #: 3
    Instructor: Duncan
*/

public class Sorter {
   
   /**
    * performs a selection sort
    * @param a- the array to be sorted
    */
   public static void selectionSort(int [] a)
   {   
      int MinPos, i,j;
      for (i=0; i<a.length; i++)
      {
         MinPos = i;
         for (j=i+1; j<a.length; j++)
         {
            if(a[i]<a[MinPos])
            MinPos = j;
         }
     swap (i, MinPos, a);
     }
  }
   /**
    * performs an insertion sort
    * @param a the array to be sorted
    */
   public static void insertionSort(int[] a)
   {
      int i, j, next;
         for (i=1; i < a.length; i++)
         {
            next = a[i];
            j = i;
            while ((j > 0) && (a[j-1] > next))
            {
               a[j] = a[j-1];
               j = j - 1;
            }
         a[j] = next;
         }
   }
   /**
    * performs a merge sort
    * @param a the array to be sorted
    */
   public static void mergeSort(int[] a)
   {
      if (a.length <= 1) return;
      int[] first = new int[a.length/2];
      int[] second = new int[a.length-first.length];
      System.arraycopy(a, 0, first, 0, first.length);
      System.arraycopy(a, first.length, second, 0, second.length);
      mergeSort(first);
      mergeSort(second);
      merge(first, second, a);
   }
   /**
    * starts a quick sort
    * @param a the array to be sorted
    */
   public static void quickSort(int[] a)
   {
      int from = 0;
      int to = a.length-1;
      int p= partition(from, to, a);
      sort(from, p, a);
      sort(p+1, to, a);
   }
   /**
    * performs a bubble sort
    * @param a the array to be sorted
    */
   public static void bubbleSort(int[] a)
   {
      int i; 
      Boolean NotDone;
      do {
         NotDone = false;
         for (i=0; i<a.length-1; ++i)
         {
            if (a[i]>a[i+1])
            {
               swap(i, i+1, a);
               NotDone = true;
            }
      }
      }while(NotDone);
   }
   /**
    * merges to arrays
    * @param first the first array
    * @param second the second array
    * @param a the meged array
    */
   private static void merge(int[] first, int[] second, int a[])
   {
      int iFirst = 0;
      int iSecond = 0;
      int j =0;
      while (iFirst < first.length && iSecond < second.length)
      {
         if (first[iFirst] < second[iSecond])
         {
            a[j] = first[iFirst];
            iFirst++;
         }
         else
         {
            a[j] = second[iSecond];
            iSecond++;
         }
         j++;
      }
      System.arraycopy(second, iFirst, a, j, first.length-iFirst);
      System.arraycopy(second, iSecond, a, j, second.length- iSecond);
   }
   
   /**
    * performs quick sort
    * @param from beginning
    * @param to end
    * @param a array to be sorted
    */
   private static void sort(int from, int to, int[] a)
   {
      if (from >= to) return;
      int p = partition(from, to, a);
      sort(from, p, a);
      sort(p+1, to, a);
   }
   
   /**
    * partitions an array
    * @param from beginning
    * @param to end
    * @param a the array
    * @return the pivot
    */
   private static int partition(int from, int to, int[] a)
   {
      int pivot = a[from];
      int i = from - 1;
      int j = to + 1;
     while (i<j)
     {
         i++; while(a[i] < pivot) i++;
         j--; while(a[j] > pivot) j--;
         if (i<j) 
         {
           swap(i,j, a);    
         }
      }
      return j;
   }
   /**
    * swaps two array elements
    * @param i first element
    * @param j second element
    * @param a the array
    */
private static void swap(int i, int j, int[] a)
{
   int temp = a[i];
   a[i] = a[j];
   a[j] = temp;
}
}
