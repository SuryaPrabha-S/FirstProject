package org.bank;

public class Child implements Parent1,Parent2 {

	@Override
	public void test3() {
		System.out.println("test3");
		
	}

	@Override
	public void test4() {
		System.out.println("test4");
		
	}

	@Override
	public void test1() {
		System.out.println("test1");
		
	}

	@Override
	public void test2() {
		System.out.println("test2");
		
	}
public static void main(String[] args) {
	Child c = new Child();
	c.test1();
	c.test2();
	c.test3();
	c.test4();
} 
}
