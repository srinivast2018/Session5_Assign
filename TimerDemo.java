//Simple Timer that can periodically print a timeout message.

package mypackage;
import java.util.Timer;
import java.util.TimerTask;


public class TimerDemo {
		Timer timer;
				
	//Creation of constructor to initialize the seconds.
		TimerDemo(int secs)	
		{	
				//Creating timer object
				timer=new Timer();
				//Scheduling a task to delay in milliseconds using schedule method 
				timer.schedule(new Task(),secs*1000);
		
		}
	
	//Creating subclass for TimerTask
	class Task extends TimerTask
	{
		public void run()
			{
			System.out.println("Time over");
			timer.cancel();
			}
		}
	
	//Declaraion of main method
	public static void main(String[] args)
		{

		//instantiating object and passing the argument in seconds
		new TimerDemo(12);
		System.out.println("Timer Task is Scheduled");
		}

}//End program
