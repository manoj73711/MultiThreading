package com.syntel.multithreading.intro.countDownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {
	CountDownLatch latch;

	Processor(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		System.out.println("stated : ");

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();

	}

}

public class CountDownLatchApp {
	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(3);

		ExecutorService exe = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 3; i++) {
			exe.submit(new Processor(latch));
		}
		System.out.println("calling latch.await() method");
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Completed");

	}
}
