package example.executor;

import java.lang.Thread.State;
import java.util.concurrent.CompletableFuture;

public class ThreadExample1 {

	public static void main(String[] args) {
	Runnable task = () -> {
		String threadName = Thread.currentThread().getName();
		State threadState = Thread.currentThread().getState();
		System.out.println("Thread Name   :  "+threadName);
		System.out.println("Thread State   :  "+threadState);
	};

	task.run();
	Thread thread = new Thread(task);
	thread.start();
	
	System.out.println("Done...!!");
	
	CompletableFuture<String> CompletableFuture = new CompletableFuture<String>();  
	}

}
