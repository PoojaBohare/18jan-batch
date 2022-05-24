package day44Poly;

public class Compiletime {
	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers :" + c);
	}
	static void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("Addition of three numbers :" + c);
	}
	public static void main(String[] args) {

		Compiletime.sum(30, 90);
		Compiletime.sum(45, 80, 22);
	}
}


/* when a method gets to know its implimentation at the time of compilation is known as 
compiletime polymorphysm....this can be achieve by using static method overloading*/