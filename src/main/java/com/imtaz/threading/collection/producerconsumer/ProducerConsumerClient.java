package com.imtaz.threading.collection.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerClient {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		Thread aq=new Thread(new Producer(list));
		aq.start();
		
		Thread rq=new Thread(new Consumer(list));
		rq.start();
		
	}

}
