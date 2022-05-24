package day24constructor;

public class Cons1 {

	public Cons1() {
		System.out.println("This is a zero-para constructor");
	}
	
	public Cons1(char c) {
		System.out.println("This is a single-para constructor");
	}

	public Cons1(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}

	public static void main(String[] args) {
		Cons1 c1 = new Cons1();
		Cons1 c2 = new Cons1(10, 20);
		Cons1 c3 = new Cons1('d');
	}
}

/**
 * Constructor Overloading: more than on constructor in a  class
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */