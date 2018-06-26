public class iFitnessStopWatch{

  private long startTime;
  private long stopTime;
  
  public static final double NANOSPERSEC=100000000.0;
  
  /*
  Starting the iwatch*/
  public void start(){
      startTime=System.nanoTime();
      
  }
  
  //Stopping the iwatch
  public void stop(){
      stopTime=System.nanoTime();
  }
  
  /*
  Elapsed tiem in seconds return the time recorded on the
  stopwatch in seconds
  */
  
  public double elapsedseconds(){
      return (stopTime-startTime)/NANOSPERSEC ;
  }
  
  //elapsed time in nano seconds.
  public long elapsednanosecs(){
      return (stopTime-startTime);
  }
  
  
  public static void main(String args[]){
      iFitnessStopWatch ticktock = new iFitnessStopWatch();
      
      ticktock.start();
      //You can now do something here 
      //and add code and do something.
      //arguably you mayneed to program an eventlistener for a stop.
      
      ticktock.stop();
      
      System.out.println("The time duration in seconds is " + ticktock.elapsedseconds());
      System.out.println("Do you believe that? ");

      System.out.println("The elapsed time in nanoseconds is "+ ticktock.elapsednanosecs());
      
  }
  
}