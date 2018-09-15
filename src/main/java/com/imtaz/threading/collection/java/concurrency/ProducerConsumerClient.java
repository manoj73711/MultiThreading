package com.imtaz.threading.collection.java.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.imtaz.threading.main;

public class ProducerConsumerClient {

	public static void main(String[] args) {

		BlockingQueue<Integer> que = new ArrayBlockingQueue<Integer>(5);

		Thread p = new Thread(new Producer(que));
		Thread c = new Thread(new Consumer(que));
		p.start();
		c.start();

	}

}
