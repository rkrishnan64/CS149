package hw2;

public class RoundRobin extends Scheduler implements AlgorithmInterface{
	public RoundRobin() {super();}
	
	public void ScheduleOperations() 
	{
		while(globalQuanta < 100)
		{
			if (processQ.peek().arrivalTime < globalQuanta)
			{
				currentProcess = processQ.pop();
			}
			if (currentProcess != null)
			{
				currentProcess.turnAroundTime++;
				if (currentProcess.expectedRT -1 < 0)
				{
					
				}
				else currentProcess.expectedRT--;
			}
			globalQuanta++;
		}
		while (readyQ.size() > 0)
		{
			
		}
	}
	
}
