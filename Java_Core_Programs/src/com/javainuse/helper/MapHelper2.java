package com.javainuse.helper;

import java.util.Map;

public class MapHelper2 implements Runnable {
	Map<String, Integer> m;

	public MapHelper2(Map<String, Integer> m) {
		this.m = m;
		new Thread(this, "MapHelper2").start();
	}

	public void run() {
		m.put("two", 2);
		try {
			System.out.println("MapHelper2 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
