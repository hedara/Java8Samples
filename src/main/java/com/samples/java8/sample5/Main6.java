package com.samples.java8.sample5;

import java.util.Arrays;
import java.util.List;

import com.samples.java8.Apple;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Integer number = 8;
		Sample1 obj = new Sample1();
		boolean result = obj.search(numbers, number);
		System.out.println(result);
		List<Apple> apples = obj.getApples(numbers);
		for(Apple a: apples)
			System.out.println(a.toString());
	}

}
