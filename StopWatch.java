

package SortTimer;

/**
    @file StopWatch.java
    @author Christopher Steinmuller
    @date 2008-3-12
    Description: Finds Time
    Course: CSC1351.01
    Logon ID: cstein1
    Project #: 3
    Instructor: Duncan
*/

public class StopWatch {
   /**
    * creates a new StopWatch
    */
   public StopWatch()
   {
      reset();
   }
   
   /**
    * starts the watch
    */
   public void start()
   {
      if (isRunning) return;
      isRunning = true;
      startTime = System.currentTimeMillis();
   }
   
   /**
    * stops the watch
    */
   public void stop()
   {
      if (!isRunning) return;
      isRunning = false;
      long endTime = System.currentTimeMillis();
      elapsedTime = elapsedTime + endTime - startTime;
   }
   
   /**
    * returns the elapsed time
    * @return the elapsed time
    */
   public long getElapsedTime()
   {
      if (isRunning)
      {
         long endTime = System.currentTimeMillis();
         return (elapsedTime + endTime - startTime);
      }
      else
         return elapsedTime;
   }
   
   /**
    * resets the watch
    */
   public void reset()
   {
      elapsedTime=0;
      isRunning = false;
   }
   
   private long elapsedTime;
   private long startTime;
   private boolean isRunning;
}
