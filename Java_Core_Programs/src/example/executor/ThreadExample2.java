package example.executor;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class ThreadExample2 {

	public static void main(String[] args) {
		Runnable task = () -> {

			try {
				String threadName = Thread.currentThread().getName();
				System.out.println("Foo Thread    Name : " + threadName);
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Bar Thread    Name : " + threadName);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		};
   Thread thread =  new Thread(task);
		thread.start();
		
		ConcurrentHashMap<String, String> cmap =  new ConcurrentHashMap<>();
		cmap.put("A", "B");		
	}

}
