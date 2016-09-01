package com.samples.java8.sample5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

import com.samples.java8.Apple;

public class Sample1 {

	public boolean search(List<Integer> nums, Integer num) {
		BiPredicate<List<Integer>,Integer> condition = List::contains;
		return condition.test(nums, num);
	}
	
	public List<Apple> getApples(List<Integer> nums) {
		return map(nums,Apple::new);
		
	}
	public List<Apple> map(List<Integer> weights, Function<Integer,Apple> generator) {
		List<Apple> apples = new ArrayList<>();
		for(Integer i: weights) {
			apples.add(generator.apply(i*10));
		}
		return apples;
	}
	
}
