package com.samples.java8.sample2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.samples.java8.Apple;
// Custom Functional Interface.

public class Main3 {
	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("red",120), new Apple("green",102), new Apple("red",92));
		Main3 obj = new Main3();
		List red_apples = obj.filterApples(apples, new ApplePredicate(){
			@Override
			public boolean filterApple(Apple apple) {
				return apple.getColor().equalsIgnoreCase("red");
			}
		});
		obj.print(red_apples);
	}
	
	List<Apple> filterApples(List<Apple> apples, ApplePredicate cond) {
		List<Apple> result = new ArrayList<Apple>();
		for(Apple a:apples) {
			if(cond.filterApple(a))
				result.add(a);
		}
		return result;
	}
	
	void print(List<Apple> apples) {
		for(Apple temp:apples){
			System.out.println(temp.toString());
		}
	}
}
