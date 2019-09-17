package com.ibs.gitdemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TsDemo {

	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		Condition cond = lock.newCondition();
		try {
			cond.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
