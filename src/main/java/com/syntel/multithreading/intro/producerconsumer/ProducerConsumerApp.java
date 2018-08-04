package com.syntel.multithreading.intro.producerconsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerApp {

	private static BlockingQueue<Integer> que = new ArrayBlockingQueue<Integer>(10);

	public static void producer() throws InterruptedException {

		while (true) {

			que.put(new Random().nextInt(100));
		}
	}

	public static void consumer() throws InterruptedException {

		while (true) {
			Thread.sleep(100);

			if (new Random().nextInt(10) == 0) {
				Integer value = que.take();

				System.out.println("Taken value is : " + value + "que size is :" + que.size());
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread producer = new Thread(new Runnable() {

			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {

			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		producer.start();
		consumer.start();

		producer.join();
		consumer.join();

	}
}
