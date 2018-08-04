package com.syntel.multithreading.intro.createthread;

/*
This class describes how to create a thread extending the Thread class
*/

class BasicThread extends Thread{
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Hello :"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}

public class ThreadCreateApp {
	
	public static void main(String[] args) {
		BasicThread thread1=new BasicThread();
		thread1.start();
		
		BasicThread thread2=new BasicThread();
		thread2.start();
		
	}

}
