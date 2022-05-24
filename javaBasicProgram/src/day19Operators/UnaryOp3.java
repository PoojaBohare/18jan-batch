package day19Operators;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a; //3
         //a= 0    + 2  + 1+2 + 3 //3
		//b= addition of 4...2+3+3=6
		System.out.println("a: "+a);// 3
		System.out.println("b: "+b);//8
		System.out.println("**********************");
		a = -5;
		b = a-- + --a + --a + a;
		//a= -5 + -6-1=-7 + -7-1 = -8
		//b=-5+-7+-8+-8=-28
		System.out.println("a: "+a);//-8
		System.out.println("b: "+b);// -28

		a = 21;
		b = --a + --a + --a + a + ++a + a++;
		//a=20 + 19 + 18 + 18 + 19 + 19 but when we are going to use value we need to add 1thats why ans is 20
		
		//b=113
		System.out.println(a);//20
		System.out.println(b);// 113

		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		//a= 
		//b=-
		System.out.println(a);//
		System.out.println(b);//
	}
}