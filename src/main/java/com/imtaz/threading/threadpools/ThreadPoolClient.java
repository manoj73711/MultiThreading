
package com.imtaz.threading.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolClient {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable processor1=new MessageProducer(1);
		executor.execute(processor1);
		
		Runnable processor2=new MessageProducer(2);
		executor.execute(processor2);

		
		Runnable processor3=new MessageProducer(3);
		executor.execute(processor3);

		
		Runnable processor4=new MessageProducer(4);
		executor.execute(processor4);
		
		executor.shutdown();
		//executor.shutdownNow();
		
		try {
			executor.awaitTermination(20, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("completed main thread");

		
	}

}
