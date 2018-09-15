package com.imtaz.threading;

public class main {

	public static void main(String[] args) {
		Sequence s = new Sequence();

		Worker worker1=new Worker(s);
		Worker worker2=new Worker(s);
		worker1.start();
		worker2.start();
	}

}

class Worker extends Thread {

	Sequence s = null;

	public Worker(Sequence s) {
		this.s = s;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "got value: " + s.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
