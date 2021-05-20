/**
 This class represents a step tracking app.
 @author Haniya Ahmed
*/
import java.util.Scanner;
public class StepTracking
{	
	/**
	 This is the main method.
	 @param String[] args  
	*/
	public static void main (String[] args)
	{	
		Scanner scan = new Scanner(System.in); 

		//asks for the inputs to compute and records it.
	   	System.out.println("Enter your target number of steps(daily):");
		int targetSteps =  scan.nextInt();
		System.out.println("Enter your daily number of steps terminated with a negitive number:");
		int numSteps  = scan.nextInt();

		int data = 0; 		  // number of days of data provided.
		int HighestSteps = 0;     // Highest number of steps taken.
		int sumSteps = 0; 	  // Total steps taken.
		int aveSteps;		  // The average steps taken.
		int goalReached = 0;      // The number of days that steps taken are equals or more than the target steps.


		//records and computes the number of steps taken, the average steps taken, the highest number of steps taken.
		while (numSteps > -1)
		{
		  data = data + 1;
		  sumSteps = numSteps + sumSteps;
		  
		  if (numSteps > HighestSteps)
		    HighestSteps = numSteps;

		  if(numSteps >= targetSteps)
		  {
			goalReached = goalReached +  1;
		  }
		  numSteps  = scan.nextInt();
		}

		//outputs the results.
		System.out.print("Step data for " + data + " days: ");
		System.out.println( goalReached + " days you reached your target");
		
		System.out.println("Highest step count: " + HighestSteps);

		aveSteps = sumSteps / data;
		System.out.println("Average step count: " + aveSteps);

	} //ends main method.
} // ends class defintion.
