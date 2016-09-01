package com.samples.java8.sample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.samples.java8.Apple;

// parametarized functionality

public class Main2 {

	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("red",120), new Apple("green",102), new Apple("red",92));
		Main2 obj=new Main2();
		List<Apple> redApples = obj.filter(apples, new ProductFilter<Apple>() {
			@Override
			public boolean filter(Apple t) {
				return t.getColor().equalsIgnoreCase("red");
			}
			
		});
		obj.print(redApples);
	}
	
	
	<T> List<T> filter(List<T> products,ProductFilter<T> cond) {
		List<T> results = new ArrayList<T>();
		for(T t: products) {
			if(cond.filter(t)){
				results.add(t);
			}
		}
		return results;
	}
	
	<T> void print(List<T> list) {
		for(T item: list) {
			System.out.println(item.toString());
		}
	}
	
}
