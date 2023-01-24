package org.bank;

public class RedBank implements IndianBank{

	@Override
	public void saving() {
		System.out.println("6%");
		
	}

	@Override
	public void fixed() {
System.out.println("6.5%");
		
	}
	public static void main(String[] args) {
		RedBank r = new RedBank ();
		r.saving();
		r.fixed();
	}

}
