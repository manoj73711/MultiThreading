package com.imtaz.threading.collection.read;

import com.imtaz.threading.main;

public class ClientApp {

	public static void main(String[] args) throws InterruptedException {

		final InventoryManager im = new InventoryManager();

		Thread populateThread = new Thread(new Runnable() {

			public void run() {

				im.populateSoldProducts();

			}
		});

		Thread displayThread = new Thread(new Runnable() {

			public void run() {

				im.display();

			}
		});

		populateThread.start();
		
		Thread.sleep(2000);
		displayThread.start();

	}

}
