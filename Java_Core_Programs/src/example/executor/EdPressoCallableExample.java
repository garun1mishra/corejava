/**
 * 
 */
package example.executor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Garun Mishra
 *
 */
public class EdPressoCallableExample implements Callable<String> {
 
	@Override
    public String call() throws Exception {
        Thread.sleep(500);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // Thread pool size is 5
        ExecutorService exe = Executors.newFixedThreadPool(5);
        //Create EdPresso instance
        Callable<String> callable = new EdPressoCallableExample();
        //create a list to hold the Future object associated with Callable
        List<Future<String>> mylist = new ArrayList<Future<String>>();
        for(int i=0; i< 50; i++){
            //submit Callable tasks to be executed by thread pool
            Future<String> store = exe.submit(callable);
            //add Future to the list, we can get return value using Future
            mylist.add(store);
        }
        for(Future<String> i: mylist){
            try {
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+i.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the service now
        exe.shutdown();
    }	

}
