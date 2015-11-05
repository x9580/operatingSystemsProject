public class Simulator {
	static String fileName = "processList.dat";
	static boolean debug = true;
	
	public static void main(String args[])
	{
		try{
			ProcessList p = new ProcessList(fileName);
			
			if(debug)
			{
				//Echo processes to console
				System.out.println("===================================");
				System.out.println("Quantum = " + p.getQuantum());
				for(int loop = 0;loop<p.getNumberOfProcesses();loop++)
				{
					System.out.println("===================================");
					System.out.println("PID: " + p.getProcess(loop).getPID());
					System.out.println("CPU Burst 1: " + p.getProcess(loop).getCPU_burst1());
					System.out.println("CPU Burst 2: " + p.getProcess(loop).getCPU_burst2());
					System.out.println("IO Burst : " + p.getProcess(loop).getIO_burst());
					System.out.println("Priority: " + p.getProcess(loop).getPriority());
					System.out.println("Period: " + p.getProcess(loop).getCurrentPeriod());	
				}
			}
			
			//Populate Schedulers
			Scheduler[] sim = new Scheduler[7-2];
			//{
				int i = 0;
				sim[i++] = new FCFS(p.clone());
				sim[i++] = new SJF(p.clone());
				sim[i++] = new SJR(p.clone());
				sim[i++] = new Priority(p.clone());
				sim[i++] = new RoundRobin(p.clone());
				//sim[i++] = new PRM(p.clone());
				//sim[i++] = new EDF(p.clone());
			//}
			
		}catch(Exception e)
		{
			System.out.println("Error trying to populate the process list: " + e.getMessage());
			System.out.println("Program quitting");
		}
		

	}

}