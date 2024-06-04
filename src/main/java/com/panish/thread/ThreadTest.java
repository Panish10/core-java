package com.panish.thread;

import java.math.BigInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadTest {
	
	ReentrantReadWriteLock reentrantLock = new ReentrantReadWriteLock();
	Lock readLock = reentrantLock.readLock();
	public static void main(String[] args) {

		int count = Runtime.getRuntime().availableProcessors();
		System.out.println(count);
	}
}
