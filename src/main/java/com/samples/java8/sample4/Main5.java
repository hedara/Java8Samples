package com.samples.java8.sample4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.samples.java8.Apple;

public class Main5 {
	
	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("red",120), new Apple("green",102), new Apple("red",92));
		Main5 obj = new Main5();
		List<Apple> redApples = obj.filterProducts(apples, Apple::isRedApple);
		obj.print(redApples);
		
	}
	
	
	<T> List<T> filterProducts(List<T> products, Predicate<T> cond) {
		List<T> results = new ArrayList<T>();
		for(T t: products) {
			if(cond.test(t))
				results.add(t);
		}
		return results;
	}
	<T> void print(List<T> list) {
		for(T item: list) {
			System.out.println(item.toString());
		}
	}
}
