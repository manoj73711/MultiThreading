package com.syntel.multithreading.intro.createthread;

/*
 * This class describes how to create a thread implementing the runnable interface
*/

class Runner implements Runnable{
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Hello :"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

public class RunnableThreadCreateApp {
	
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runner());
		Thread t2=new Thread(new Runner());
		
		t1.start();
		t2.start();
		
	}

}
