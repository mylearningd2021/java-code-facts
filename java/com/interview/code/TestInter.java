package com.interview.code;

interface A {
	void method1();

	static void staicMethod() {
		System.out.println("Interface A - staicMethod");
	}

}

public class TestInter implements A {

	@Override
	public void method1() {
		System.out.println("A-abstrat method method1");

	}

	 static void staicMethod() {
		System.out.println("Class A - staicMethod");
	}

	public static void main(String[] args) {
		
		A.staicMethod();
		TestInter.staicMethod();

		
	}

}
