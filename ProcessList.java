import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ProcessList extends Exception{
	private Process[] processes;
	private int quantum;
	
	private ProcessList(){}
	
	public ProcessList(String filename) throws FileNotFoundException
	{
		//Open file for reading
		Scanner in = new Scanner(new File(filename));
		
		//Read in Total_Processes
		in.next();
		
		//read in "Total_Processes"
		int processTotal = in.nextInt();
		
		//Advance to the next line
		in.nextLine();
		
		//Read in "Quantum"
		in.next();
		
		//read in quantum
		quantum = in.nextInt();
		
		//Advance to the next line
		in.nextLine();
		
		//Advance to the next line to skip past headers %Pid CPU Burst etc
		in.nextLine();
		
		//Allocate processes
		processes = new Process[processTotal];
		
		//Read in each process information
		for(int loop = 0; loop<processTotal;loop++)
		{
			int pid = in.nextInt();
			int CPU_burst = in.nextInt();
			int IO_burst = in.nextInt(); 
			int priority = in.nextInt();
			int period = in.nextInt();
			
			processes[loop] = new Process(pid,CPU_burst,IO_burst,priority,period);
		}
	}
	
	public int getQuantum()
	{
		//return the quantum value for RR
		return quantum;
	}
	
	public Process getProcess(int index)
	{
		//returns requested process if it exists, null otherwise
		if(index<processes.length && index>=0)
		{
			return processes[index];
		}
		return null;
	}
	
	public int getNumberOfProcesses()
	{
		//returns the total number of processes
		return processes.length;
	}
	
	public ProcessList clone()
	{
		//Make an identical copy of the Processes in ProcessList
		
		ProcessList pl = new ProcessList();
		pl.processes = new Process[processes.length];
		pl.quantum = this.quantum;
		for(int loop = 0; loop < processes.length; loop++)
		{
			pl.processes[loop] = processes[loop].clone();
		}
		
		return pl;
	}
}