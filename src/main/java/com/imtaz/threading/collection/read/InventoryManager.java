package com.imtaz.threading.collection.read;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	List<Product> soldProductlist = new CopyOnWriteArrayList<Product>();
	List<Product> purchaseProductList = new ArrayList<Product>();

	public void populateSoldProducts() {

		for (int i = 0; i < 1000; i++) {
			soldProductlist.add(new Product(i, "test_product " + i));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void display() {
		for (Product product : purchaseProductList) {
			System.out.println(product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
