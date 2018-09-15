package com.In28minutes.threads.executor.multiple;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(1);
		
		List<CallableTask> tasks=Arrays.asList(new CallableTask("india"),new CallableTask("usa"),new CallableTask("uk"));
		
		//List<Future<String>> invokeAll=service.invokeAll(tasks);
		
		//get the values from the invoke all
		
	}

}
