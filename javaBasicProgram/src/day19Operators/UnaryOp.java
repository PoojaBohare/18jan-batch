package day19Operators;

public class UnaryOp {
	public static void main(String[] args) {

		int a = 10;
		int b = a;
		System.out.println("a: " + a);//10
		System.out.println("b: " + b);//10
		/**
		 * pre: first perform the operation dn use the updated value 
		 * post: first use the value dn perform the operation
		 */
		int k = ++a;
		System.out.println("k: " + k);//k=A,,,k=11 updated value
		System.out.println("a: " + a);//a+1=10+1=11
		int j = k++;//
		System.out.println("k: " + k);//12
		System.out.println("j: " + j);//11

		int r = 21;
		System.out.println("r=: " + r++);//21
		System.out.println("r=: " + r);//21+1=22
		System.out.println("r=: " + ++r);//22+1=23
		System.out.println("r=: " + r);//23

		int x = 105;
		System.out.println("x=: " + --x);//104
		System.out.println("x=: " + x);// 104
		System.out.println("x=: " + x--);//104 
		System.out.println("x=: " + x);// 103
	}
}

/*




*/