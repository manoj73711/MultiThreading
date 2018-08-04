package com.syntel.multithreading.intro.synchronizedkeyword;

/**
 * Hello world!
 *
 */
public class SynchronizedDemoApp {

	int n = 0;

	public static void main(String[] args) {
		SynchronizedDemoApp app = new SynchronizedDemoApp();
		app.doWork();

	}
    
	public  synchronized void increment() {
		n=n+1;
	}
	public void doWork() {

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 100000; i++) {
					//n = n + 1;
					increment();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 100000; i++) {
					//n = n + 1;
					increment();
				}
			}
		});

		t1.start();
		t2.start();

		// tell main thread to wait until the execution of the sub threads are completed
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("value of n is :" + n);

	}
}
