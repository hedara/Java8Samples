package com.samples.java8;

public class Apple {
	private String color;
	private double weight;
	public Apple(String color, double weight) {
		this.color=color;
		this.weight = weight;
	}
	public Apple() {}
	public Apple(Integer weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String toString() {
		return color+", "+weight;
	}
	
	public static boolean isRedApple(Apple apple) {
		return apple.getColor().trim().equalsIgnoreCase("red");
	}
	
}
