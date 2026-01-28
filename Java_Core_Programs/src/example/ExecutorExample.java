/**
 * 
 */
package example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Garun Mishra
 * @Date 07-Jan-2022
 * @What_is_Executor The Java ExecutorService is the interface which allows us
 *                   to execute tasks on threads asynchronously. The Java
 *                   ExecutorService interface is present in the
 *                   java.util.concurrent package. The ExecutorService helps in
 *                   maintaining a pool of threads and assigns them tasks. It
 *                   also provides the facility to queue up tasks until there is
 *                   a free thread available if the number of tasks is more than
 *                   the threads available.
 * @Some_Methods_OfExecutor_Interface @1 boolean awaitTermination(long timeout,
 *                                    TimeUnit unit) @2 <T> List
 *                                    invokeAll(Collection<? extends
 *                                    Callable<T>> tasks) @3 boolean
 *                                    isShutdown() @4 boolean isTerminated() @5
 *                                    void shutdown() @6 List shutdownNow()
 * 
 * 
 * 
 * 
 */
public class ExecutorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exService = Executors.newFixedThreadPool(10);

		exService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside the executor");
			}
		   }
		);
		
	exService.shutdown();	
		

	}

}
