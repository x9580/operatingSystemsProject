import java.io.PrintWriter;

public class FCFS  extends Scheduler{
	
	public FCFS(ProcessList processList)
	{
		super(processList);
	}

	@Override
	public void simulate(int snapshot, PrintWriter out) {
		// TODO Auto-generated method stub
		int count = 0;
        System.out.println("============================================ ");
        System.out.println("Process ID | Turnaround time | Waiting time ");
        System.out.println("============================================ ");
        for()//need to fill in for loop but idk what to call here{
            if(count==0){
                job.processArrivalTime = (); //process arrival time = get arrival time
                job.ProcessCompletionTime = ()+); //process completion = job arrival time + cpu time
                }else{
                job.processArrivalTime = temp-(); //temp - job arrival time
                job.ProcessCompletionTime = temp+(); //temp + cpu time
            }
            
            temp = ;//temp = process completion time
            job.turnAroundTime = temp-(); //job.turnaroundtime = temp - job completion time
            job.waitingTime = job.turnAroundTime-job.getCpuTime();
            count++;
            
            avgWaitingTime =  avgWaitingTime+job.waitingTime; //avgWaitingtime + job waiting time
            avgTurnAroundTime = avgTurnAroundTime+job.turnAroundTime;
            System.out.println("   "+process.getPID()+"  | "+"   "+.turnAroundTime+"  | "+"   "+job.waitingTime+" ");
            System.out.println("----------------------------------------");
        }
        System.out.println("===============================================");
        System.out.println("Avg waiting time:"+avgWaitingTime/List.size()/*need to call the list we are reading from here*/);
        System.out.println("===============================================");
        System.out.println("Avg turn around time:"+avgTurnAroundTime/List.size()/*need to call the list here aswell*/);
        System.out.println("===============================================");
		
	}

	@Override
	public void finalReport(PrintWriter pw) {
		// TODO Auto-generated method stub
		//not sure what to do here------
		
	}

}
