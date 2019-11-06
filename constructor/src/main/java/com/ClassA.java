package com;

public class ClassA {

	String x, y;

	public ClassA() {
		System.out.println("Default");
	}

	public ClassA(String x, String y) {
		System.out.println("Parameterized");
		this.x = x;
		this.y = y;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "ClassA [x=" + x + ", y=" + y + "]";
	}
}