import java.io.PrintWriter;
import java.util.LinkedList;

public abstract class Scheduler {
	protected ProcessList processList;
	protected LinkedList <String> CPUOrdering = new LinkedList<String>();
	protected int processInCPU;
	
	private Scheduler(){}
	
	public Scheduler(ProcessList processList)
	{
		this.processList = processList;
	}
	
	public abstract void simulate(int snapshot, PrintWriter out);
	//Will run executing the simulation, must support snapshots to pw
	
	public abstract void finalReport(PrintWriter pw);
	//Will write the final report to pw

}