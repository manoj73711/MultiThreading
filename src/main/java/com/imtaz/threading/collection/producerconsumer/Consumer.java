package com.imtaz.threading.collection.producerconsumer;

import java.util.List;

public class Consumer implements Runnable {
	List<Integer> answerQuestion = null;

	public Consumer(List<Integer> answerQuestion) {
		this.answerQuestion = answerQuestion;
	}

	public void answerQuestion() throws InterruptedException {
		synchronized (answerQuestion) {
			while (answerQuestion.isEmpty()) {
				System.out.println("No questions to answer");
				answerQuestion.wait();
			}
		}

		synchronized (answerQuestion) {
			Thread.sleep(100);
			System.out.println("Answered question :" + answerQuestion.remove(0));
			answerQuestion.notify();
		}
	}

	public void run() {
		while (true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {
			}

		}
	}
}
