package com.In28minutes.threads.executor.multiple;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable{
	private String name;
	
	public CallableTask(String name) {
		this.name=name;
	}

	public Object call() throws Exception {
		Thread.sleep(1000);
		// TODO Auto-generated method stub
		return "Hello"+ name;
	}
	
}

public class CallableRunner {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service=Executors.newFixedThreadPool(1);
		Future<String> promise=service.submit(new CallableTask(" jonam"));
		
		System.out.println("completed service.submit(new CallableTask(\" jonam\"));");
		
		System.out.println(promise.get());
		
		System.out.println("main completed ");
		
		
		
	}

}
