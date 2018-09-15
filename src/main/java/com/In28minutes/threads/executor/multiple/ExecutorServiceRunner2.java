package com.In28minutes.threads.executor.multiple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*This class explains 
1. How to multithread multiple tasks
2. Implement Runnable interface
3. Extending the thread class
*/
class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() {
		System.out.println("\ntask " + number + " is started");
		for (int i = number * 100; i <= number * 100 + 99; i++)
			System.out.println(i + " ");

		System.out.println("\nTask " + number + " is done");
	}
}

public class ExecutorServiceRunner2 {

	public static void main(String[] args) {

		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		executorService.execute(new Task(8));
		executorService.shutdown();
		
	}
}