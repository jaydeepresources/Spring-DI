package com;

public class SampleClass {

	ClassA a;

	public SampleClass() {
		System.out.println(".");
	}

	public ClassA getA() {
		return a;
	}

	public void setA(ClassA a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "SampleClass HashCode = " + hashCode() + "[ a=" + a + "]";
	}

}
