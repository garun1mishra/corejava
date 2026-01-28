package example.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceShutDownExample {

	public static void main(String[] args) {
		
		ExecutorService exc = Executors.newFixedThreadPool(10);
		try {
			System.out.println("Attempt to shutdownExecutors");
			
			exc.shutdown();
			exc.awaitTermination(5, TimeUnit.SECONDS);
			
			
		} catch (InterruptedException e) {
    System.out.println("Task INterrupted...!! ");
		} finally {
				if(!exc.isTerminated()) {
					System.err.println("Cancel Non finished task..");
				}
				
				exc.shutdownNow();
				System.out.println("ShutDown Completed");
		}

	}

}
