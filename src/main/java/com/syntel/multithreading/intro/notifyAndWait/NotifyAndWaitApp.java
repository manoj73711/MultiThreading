package com.syntel.multithreading.intro.notifyAndWait;

/**
 * Hello world!
 *
 */
public class NotifyAndWaitApp 
{
    public static void main( String[] args ) throws InterruptedException
    {
        final ConsumerAndProducer cp=new ConsumerAndProducer();
        
        Thread pt=new Thread(new Runnable() {
			
			public void run() {
				try {
					cp.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
        
        
        Thread ct=new Thread(new Runnable() {
			
			public void run() {
				try {
					cp.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
        
        pt.start();
        ct.start();
        
        pt.join();
        ct.join();
        
    }
}
