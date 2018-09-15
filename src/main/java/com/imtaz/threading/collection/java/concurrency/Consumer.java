package com.imtaz.threading.collection.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> que = null;

	public Consumer(BlockingQueue<Integer> que) {
		this.que = que;
	}

	public void run() {
		
		while (true) {
			try {
				System.out.println("Answering and removing the question :  " + que.take());
			} catch (InterruptedException e) {

			} 
		}

	}

}
