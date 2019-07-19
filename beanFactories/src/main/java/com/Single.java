package com;

public class Single {

	private static final Single single = new Single();

	private Single() {
		
	}

	public static Single getSingle() {
		return single;
	}

	@Override
	public String toString() {
		return "Single object: " + hashCode();
	}
}
