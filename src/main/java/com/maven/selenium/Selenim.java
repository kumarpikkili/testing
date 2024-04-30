package com.maven.selenium;

import java.util.HashMap;
import java.util.Map;

public class Selenim {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "kumar");
		m.put(2, "madu");
		m.put(3, "rudra");
		m.put(4, "satish");

		System.out.println(m.entrySet());

		for (Map.Entry<Integer, String> d : m.entrySet()) {
			System.out.println(d);
		}


	}

}
