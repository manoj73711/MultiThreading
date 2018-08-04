package com.syntel.multithreading.intro.notifyAndWait;

public class ConsumerAndProducer {
	
	
	
	
	public void produce() throws InterruptedException {
		
		synchronized (this) {
			
			System.out.println("producer posted add for sale item");
			wait();
			System.out.println("produced removed sale add");
			
		}
		
		
	}

	public void consume() throws InterruptedException {
		Thread.sleep(1000);
		synchronized (this) {
			System.out.println("Consumer watched and liked the item add");
			notify();
			System.out.println("Consumer bought the item and notified");
			
		}
		

	}

}
