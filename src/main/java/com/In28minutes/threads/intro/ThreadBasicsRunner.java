package com.In28minutes.threads.intro;

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

public class ThreadBasicsRunner {

	public static void main(String[] args) {

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

		// task 3
		System.out.println("\nTask 3 is kicked off");
		for (int i = 301; i <= 400; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\ntask 3 is done");
	}

}
