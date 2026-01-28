package com.javainuse.helper;

import java.util.Map;

public class MapHelper4 implements Runnable {
	Map<String, Integer> m;

	public MapHelper4(Map<String, Integer> m) {
		this.m = m;
		new Thread(this, "MapHelper4").start();
	}

	public void run() {
		m.put("four", 4);
		try {
			System.out.println("MapHelper4 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
