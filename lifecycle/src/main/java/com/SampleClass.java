package com;

public class SampleClass {
	private String str;

	public void init() {
		System.out.println("Init Running !");
		str = "alive !";
	}
	
	public void destroy() {
		System.out.println("Destroy Running !");
		str = "dead";
		System.out.println(str);
	}

	public SampleClass() {
		System.out.println("Default Constructor");
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "SampleClass [str=" + str + "]";
	}
}
