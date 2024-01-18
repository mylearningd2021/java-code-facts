package com.interview.code;


interface Demo {
    void demoMethod();
	default void defMethod() {
		System.out.println("B -default Method");
	}
}

/*
 * @FunctionalInterface interface A { void methodOfA();
 * 
 * default void defMethod() { System.out.println("A -default Method"); } }
 * 
 * @FunctionalInterface interface B extends Demo { void mmethodOfB();
 * 
 * default void defMethod() { System.out.println("B -default Method"); } }
 * 
 * interface Sample { void sampleMethod(); }
 * 
 * public class FunctionalInterface1 implements A, B {
 * 
 * @Override public void mmethodOfB() { System.out.println("B- mmethodOfB()");
 * 
 * }
 * 
 * @Override public void methodOfA() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */