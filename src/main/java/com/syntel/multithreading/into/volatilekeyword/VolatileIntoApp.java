package com.syntel.multithreading.into.volatilekeyword;

import java.util.Scanner;

class VolatileKey extends Thread {
	boolean toRun = true;

	public void run() {
		while (toRun) {

			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {
		toRun = false;
	}
}

public class VolatileIntoApp {
	public static void main(String[] args) {

		VolatileKey thread = new VolatileKey();
		thread.start();

		Scanner sca = new Scanner(System.in);
		sca.nextLine();
		thread.shutDown();

	}
}
