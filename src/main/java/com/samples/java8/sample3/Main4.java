package com.samples.java8.sample3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.samples.java8.Apple;
// Lambda
public class Main4 {
	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("red",120), new Apple("green",102), new Apple("red",92));
		Main4 obj = new Main4();
		List<Apple> redApples = obj.filterProducts(apples, a -> a.getColor().equalsIgnoreCase("red") );
		obj.print(redApples);
		System.out.println("done");
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
