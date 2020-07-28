package com.imtaz.threading.collection.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> que = null;
	int questionNumber;

	public Producer(BlockingQueue<Integer> que) {
		this.que = que;
	}

	public void run() {

		while (true) {
			try {
				synchronized (que) {
					questionNumber=questionNumber+1;
					System.out.println("Adding question to stack :"+questionNumber);
					que.put(questionNumber);
				}

			} catch (InterruptedException e) {
			} 
		}

	}

}
