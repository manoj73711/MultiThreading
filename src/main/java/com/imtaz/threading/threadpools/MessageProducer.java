package com.imtaz.threading.threadpools;

public class MessageProducer implements Runnable{

	private int message;
	
		public MessageProducer(int message) {
		this.message=message;
	}
	
		
		public void run() {
			System.out.println(Thread.currentThread().getName()+ " [Received] Message " +message );
			doSomeWork();
			System.out.println(Thread.currentThread().getName()+ "[Done] processing message"+message);
		}


		private void doSomeWork() {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("Error occured in processing");			}
			
		}
		


}
