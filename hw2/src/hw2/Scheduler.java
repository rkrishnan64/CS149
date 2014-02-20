package hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Scheduler{
	public int globalQuanta;
	public LinkedList<Process> processQ;
	public LinkedList<Process> completed;
	public LinkedList<Process> readyQ;
	public ArrayList<Process> timechart;
	public Process currentProcess;
	
	public Scheduler(){
		globalQuanta = 0;
		Process[] temp = new Process[100];
		for (int i = 0; i < 100; i++)
		{
			temp[i] = new Process();
			//temp.add(new Process());
		}
		Arrays.sort(temp);
		for (int i = 0; i < 100; i++)
		{
			temp[i].name = Integer.toString(i);
			//temp.add(new Process());
		}
		processQ = new LinkedList<Process>(Arrays.asList(temp));
		completed = new LinkedList<Process>();
		readyQ = new LinkedList<Process>();
		timechart = new ArrayList<Process>();
		currentProcess = null;
	}
	
	
	public void printTimeChart()
	{
		for(int i = 0; i < timechart.size(); i++)
		{
			if(i % 10 == 0) System.out.println();
			System.out.print(timechart.get(i).name+ " ");
		}
	}
	
	
	public void printThroughput()
	{
		System.out.println("Throughput: " + ((double)completed.size()/(double)globalQuanta));
	}
	
	public void printAVGTurnaround()
	{
		System.out.println("Average Turnaround Time: " + (completed.size()/globalQuanta));
	}
	
	public void printAVGWait()
	{
		System.out.println("Average Wait Time: " + (completed.size()/globalQuanta));
	}
	
	public void printAVGResponse()
	{
		System.out.println("Average Response Time: " + (completed.size()/globalQuanta));
	}
	
	public void testProcessQOrder(){
		for (Process p: processQ)
		{
			System.out.println("arrival time: " + p.arrivalTime);
		}
	}
	
	
	public static void main(String[] args){
		Scheduler s = new Scheduler();

		while (s.globalQuanta < 100)
		{
			
		}
	}

}
