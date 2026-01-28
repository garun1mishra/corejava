/**
 * 
 */
package example.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Garun Mishra
 *
 */
public class ExecutorsExample {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// 1st way to create ExecutorServices
		ExecutorService ex = Executors.newFixedThreadPool(10);
		// 2nd way to create ExecutorService
		ExecutorService exc = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
		
		//Assigning task: Excutorservice can excute Runnable and Collable Task
		Runnable runnableTask =  () -> {
			try {
				TimeUnit.MILLISECONDS.sleep(30000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Callable<String> callableTask = () -> {
			TimeUnit.MILLISECONDS.sleep(3000);
			return "Callable Tasks execution";
		};
		
		List<Callable<String>> callableTaskList = new ArrayList<>();
		
		callableTaskList.add(callableTask);
		callableTaskList.add(callableTask);
		callableTaskList.add(callableTask);
		
		// Execute method
		exc.execute(runnableTask);
		//submit
		exc.submit(callableTask);
		
		// involkAny method
		String result  = exc.invokeAny(callableTaskList);		
		
		//involkAll method
		
		List<Future<String>> futures = exc.invokeAll(callableTaskList);
		
		
	
		
		
		
		
		
		
	}

}
