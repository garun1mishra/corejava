package com.javainuse.helper;

import java.util.Map;

public class MapHelper1 implements Runnable {
	Map<String, Integer> m;

	public MapHelper1(Map<String, Integer> m) {
		this.m = m;
		new Thread(this, "MapHelper1").start();
	}

	public void run() {
		m.put("One", 1);
		try {
			System.out.println("MapHelper1 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
