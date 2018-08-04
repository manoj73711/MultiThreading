package com.syntel.multithreading.intro.createthread;

/*This class describes how to create a thread real quick 
at any point of time in the programming
*/
public class QuickThreadCreateApp {
	
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {
			
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
			
		});
		
		t1.start();
	}

}
