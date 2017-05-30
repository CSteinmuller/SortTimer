

package SortTimer;
/**
    @file SortTimer.java
    @author Christopher Steinmuller
    @date 2008-3-12
    Description: Client program for sorting
    Course: CSC1351.01
    Logon ID: cstein1
    Project #: 3
    Instructor: Duncan
*/

public class SortTimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k=0,j=0,i=0;
        StopWatch timer = new StopWatch();
        int[][][] first = new int[3][5][10000];
        int[][][] second = new int[3][5][20000];
        int[][][] third = new int[3][5][30000];
        int[][][] fourth = new int[3][5][40000];
        int[][][] fith = new int[3][5][50000];
        int[][][] sixth = new int[3][5][60000];
        long[][][] time = new long[6][5][3];
        while (k<5)
        {
          first[0][k] = ArrayUtil.logIntArray(10000, 1);
          first[1][k] = ArrayUtil.logIntArray(10000, -1);
          first[2][k] = ArrayUtil.randomIntArray(10000,10000);
          k++;
        }
          while (j < 3)
          {
             timer.reset();
             timer.start();
             Sorter.selectionSort(first[j][0]);
             timer.stop();
             time[0][0][j]= timer.getElapsedTime();
             timer.reset();
             timer.start();
             Sorter.insertionSort(first[j][1]);
             timer.stop();
             time[0][1][j]= timer.getElapsedTime();
             timer.reset();
             timer.start();
             Sorter.bubbleSort(first[j][2]);
             timer.stop();
             time[0][2][j]= timer.getElapsedTime();
             timer.reset();
             timer.start();
             Sorter.quickSort(first[j][3]);
             timer.stop();
             time[0][3][j]= timer.getElapsedTime();
             timer.reset();
             timer.start();
             Sorter.mergeSort(first[j][4]);
             timer.stop();
             time[0][4][j]= timer.getElapsedTime();
             j++;
          }
        k =0;
        while (k<5)
        {
          second[0][k] = ArrayUtil.logIntArray(20000, 1);
          second[1][k] = ArrayUtil.logIntArray(20000, -1);
          second[2][k] = ArrayUtil.randomIntArray(20000,20000);
          k++;
        }
          j=0;
          while (j<3){
          timer.reset();
          timer.start();
          Sorter.selectionSort(second[j][0]);
          timer.stop();
          time[1][0][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.insertionSort(second[j][1]);
          timer.stop();
          time[1][1][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.bubbleSort(second[j][2]);
          timer.stop();
          time[1][2][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.quickSort(second[j][3]);
          timer.stop();
          time[1][3][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.mergeSort(second[j][4]);
          timer.stop();
          time[1][4][j]= timer.getElapsedTime();
          j++;
          }
        k =0;
        while (k<5)
        {
          third[0][k] = ArrayUtil.logIntArray(30000, 1);
          third[1][k] = ArrayUtil.logIntArray(30000, -1);
          third[2][k] = ArrayUtil.randomIntArray(30000,30000);
          k++;             
        }
        j=0;
          while (j<3){
          timer.reset();
          timer.start();
          Sorter.selectionSort(third[j][0]);
          timer.stop();
          time[2][0][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.insertionSort(third[j][1]);
          timer.stop();
          time[2][1][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.bubbleSort(third[j][2]);
          timer.stop();
          time[2][2][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.quickSort(third[j][3]);
          timer.stop();
          time[2][3][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.mergeSort(third[j][4]);
          timer.stop();
          time[2][4][j]= timer.getElapsedTime();
          j++;
          }
        k =0;
        while (k<5)
        {
          fourth[0][k] = ArrayUtil.logIntArray(40000, 1);
          fourth[1][k] = ArrayUtil.logIntArray(40000, -1);
          fourth[2][k] = ArrayUtil.randomIntArray(40000,40000);
          k++;
        }
        j=0;
          while (j<3){
          timer.reset();
          timer.start();
          Sorter.selectionSort(fourth[j][0]);
          timer.stop();
          time[3][0][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.insertionSort(fourth[j][1]);
          timer.stop();
          time[3][1][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.bubbleSort(fourth[j][2]);
          timer.stop();
          time[3][2][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.quickSort(fourth[j][3]);
          timer.stop();
          time[3][3][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.mergeSort(fourth[j][4]);
          timer.stop();
          time[3][4][j]= timer.getElapsedTime();
          j++;
          }
         k =0;
        while (k<5)
        {
          fith[0][k] = ArrayUtil.logIntArray(50000, 1);
          fith[1][k] = ArrayUtil.logIntArray(50000, -1);
          fith[2][k] = ArrayUtil.randomIntArray(50000,50000);
          k++;
        }
         j=0;
          while (j<3){
          timer.reset();
          timer.start();
          Sorter.selectionSort(fith[j][0]);
          timer.stop();
          time[4][0][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.insertionSort(fith[j][1]);
          timer.stop();
          time[4][1][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.bubbleSort(fith[j][2]);
          timer.stop();
          time[4][2][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.quickSort(fith[j][3]);
          timer.stop();
          time[4][3][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.mergeSort(fith[j][4]);
          timer.stop();
          time[4][4][j]= timer.getElapsedTime();
          j++;
          }
         k =0;
        j=0;
        while (k<5)
        {                                              
          sixth[0][k] = ArrayUtil.logIntArray(60000, 1);
          sixth[1][k] = ArrayUtil.logIntArray(60000, -1);
          sixth[2][k] = ArrayUtil.randomIntArray(60000,60000);
          k++;
        }
          while (j<3){
          timer.reset();
          timer.start();
          Sorter.selectionSort(sixth[j][0]);
          timer.stop();
          time[5][0][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.insertionSort(sixth[j][1]);
          timer.stop();
          time[5][1][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.bubbleSort(sixth[j][2]);
          timer.stop();
          time[5][2][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.quickSort(sixth[j][3]);
          timer.stop();
          time[5][3][j]= timer.getElapsedTime();
          timer.reset();
          timer.start();
          Sorter.mergeSort(sixth[j][4]);
          timer.stop();
          time[5][4][j]= timer.getElapsedTime();
          j++;
          }
        System.out.println("             Using Arrays with Random Integers");
        System.out.println("  n    selectionSort  insertionSort  bubbleSort  quickSort  MergeSort");
        while (i<6)
        {
            System.out.print(+(i+1)*10000);
               j=0;
               while (j<5)
               {
                  System.out.print(" "+time[i][j][2]);
                  j++;
               }
            i++;
            System.out.println();
        }
        i=0;
       System.out.println("             Using Arrays with Integers Sorted in Acsending Order");
        System.out.println("  n    selectionSort  insertionSort  bubbleSort  quickSort  MergeSort");
        while (i<6)
        {
            System.out.print(+(i+1)*10000);
               j=0;
               while (j<5)
               {
                  System.out.print(" "+time[i][j][0]);
                  j++;
               }
            i++;
            System.out.println();
        }
        i=0;
       System.out.println("             Using Arrays with Integers Sorted in Descending Order");
        System.out.println("  n    selectionSort  insertionSort  bubbleSort  quickSort  MergeSort");
        while (i<6)
        {
            System.out.print(+(i+1)*10000);
               j=0;
               while (j<5)
               {
                  System.out.print(" "+time[i][j][1]);
                  j++;
               }
            i++;
            System.out.println();
        }
        
               
              
    }
}
