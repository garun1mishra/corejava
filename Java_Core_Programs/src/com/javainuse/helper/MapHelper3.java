package com.javainuse.helper;

import java.util.Map;

public class MapHelper3 implements Runnable {
	Map<String, Integer> m;

	public MapHelper3(Map<String, Integer> m) {
		this.m = m;
		new Thread(this, "MapHelper3").start();
	}

	public void run() {
		m.put("three", 3);
		try {
			System.out.println("MapHelper3 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
