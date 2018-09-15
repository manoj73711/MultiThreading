package com.In28minutes.threads.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*This class explains 
1. How to multithread multiple tasks
2. Implement Runnable interface
3. Extending the thread class
*/
class Task1 extends Thread {

	public void run() {
		System.out.println("task 1 is started");
		for (int i = 101; i <= 200; i++)
			System.out.println(i + " ");

		System.out.println("task 1 is done");
	}
}

class Task2 implements Runnable {

	public void run() {
		System.out.println("task 2 is started");
		for (int i = 201; i <= 300; i++)
			System.out.println(i + " ");

		System.out.println("\ntask 2 is done");
	}

}

public class ExecutorServiceRunner {

	public static void main(String[] args) {

		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));

		// task 3
		System.out.println("\nTask 3 is kicked off");
		for (int i = 301; i <= 400; i++)
			System.out.println(i + " ");

		System.out.println("\ntask 3 is done");

		executorService.shutdown();
	}
}