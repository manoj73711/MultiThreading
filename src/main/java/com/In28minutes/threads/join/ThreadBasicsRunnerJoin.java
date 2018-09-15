package com.In28minutes.threads.join;

/*This class explains 
 * join() and yield
 * */
class Task1 extends Thread {

	public void run() {
		System.out.println("task 1 is started");
		for (int i = 101; i <= 200; i++)
			System.out.println(i + " ");

		//yielding is a hint to scheduler to yield to others threads when the current one is taking more time
		Thread.yield();
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

public class ThreadBasicsRunnerJoin {

	public static void main(String[] args) throws InterruptedException {

		// task 1
		System.out.println("\nTask 1 is kicked off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		// task 2
		System.out.println("\nTask 2 is kicked off");
		Task2 task2=new Task2();
		Thread task2Thread=new Thread(task2);
		//setting the priority
		task2Thread.setPriority(10);
		task2Thread.start();
		
		/*
		 * Below section is for joins explanation
		 * 
		 * */
		
		//task 3 should start only after task1 and task2 completes
		task1.join();
		task2Thread.join();
		
		
		// task 3
		System.out.println("\nTask 3 is kicked off");
		for (int i = 301; i <= 400; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\ntask 3 is done");
	}

}
