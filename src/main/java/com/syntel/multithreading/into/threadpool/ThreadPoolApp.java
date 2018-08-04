package com.syntel.multithreading.into.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
class processor implements Runnable {
	int id;

	processor(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("Starting: " + id);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed: " + id);

	}
}

public class ThreadPoolApp {
	public static void main(String[] args) {
		ExecutorService excutor = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			excutor.submit(new processor(i));
		}

		excutor.shutdown();

		System.out.println("All the tasks are submitted");

		try {
			excutor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
		}
		System.out.println("All the tasks are completed");

	}
}
