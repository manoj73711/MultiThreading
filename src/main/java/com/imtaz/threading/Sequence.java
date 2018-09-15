package com.imtaz.threading;

public class Sequence { //this class is to maintain the sequence and return the next seq value
	int value = 0;

	public int getNext() {
		synchronized (this) {
			value++;
			return value;
		}

	}

}
