package com.netjstech.array;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		String[] cities = {"New Delhi", "Mumbai", "New York", "Chicago", "Berlin"};
		// foreach loop
		for(String city: cities) {
			System.out.println(city);
		}
		

		
		cities[4] = "Madrid";
		
		// forEach method
		Arrays.stream(cities).forEach(System.out::println);
		
		System.out.println(cities[-1]);

	}

}
