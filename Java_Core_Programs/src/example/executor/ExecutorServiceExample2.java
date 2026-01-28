package example.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample2 {

	public static void main(String[] args) {
		  ExecutorService executorService = Executors.newFixedThreadPool(10);
		  executorService.submit( () -> {
			  String threadName =  Thread.currentThread().getName();
			  System.out.println("Hello Thread   :   "+threadName);
		  });

	}

}
