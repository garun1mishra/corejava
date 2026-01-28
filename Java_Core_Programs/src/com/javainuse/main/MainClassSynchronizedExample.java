package com.javainuse.main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.javainuse.helper.MapHelper1;
import com.javainuse.helper.MapHelper2;
import com.javainuse.helper.MapHelper3;
import com.javainuse.helper.MapHelper4;

public class MainClassSynchronizedExample {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> syncMap = Collections.synchronizedMap(hashMap);
		MapHelper1 mapHelper1 = new MapHelper1(syncMap);
		MapHelper2 mapHelper2 = new MapHelper2(syncMap);
		MapHelper3 mapHelper3 = new MapHelper3(syncMap);
		MapHelper4 mapHelper4 = new MapHelper4(syncMap);

		for (Map.Entry<String, Integer> e : syncMap.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}


	}

}
