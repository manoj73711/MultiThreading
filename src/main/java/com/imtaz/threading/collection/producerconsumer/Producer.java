package com.imtaz.threading.collection.producerconsumer;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> list = null;
	private int readQuestion;

	public Producer(List<Integer> list) {
		this.list = list;
	}

	public void readQuestion(int questionNo) throws InterruptedException {
		synchronized (list) {
			while (list.size() == 5) {
				System.out.println("Question stack is full with limit 5");
				list.wait();
			}
		}

		synchronized (list) {
			System.out.println("Adding question to stack "+questionNo);
			list.add(questionNo);
			Thread.sleep(100);
			list.notify();
		}
	}

	public void run() {
		while (true) {
			try {
				readQuestion(readQuestion++);
			} catch (InterruptedException e) {
			}

		}
	}
}
