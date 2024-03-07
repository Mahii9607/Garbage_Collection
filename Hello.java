package com.GC;

public class Hello {

	void m1() {
		System.out.println("M1");
		
	}
	
	void m2() {
		System.out.println("m2");
		
	}
	
	@Override
	protected void finalize()throws Throwable{
		
	}
	
	public static void main(String[] args) {
		Hello h = new Hello();
		h.m1();
		h.m2();
		
   	System.gc();
	
	
	}

}
