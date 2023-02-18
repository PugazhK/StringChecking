package exceptions;

public class Overflow {
	
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}

	public static void main(String[] args) {
		Overflow of = new Overflow();
		of.findA();
	}

}
