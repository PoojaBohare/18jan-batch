package day51WrapperClass;

public class BoxingOperation2 {

	public static void main(String[] args) {
		
		char c1='A';
	
		Character charObj1=new Character(c1);//Explicit boxing
		System.out.println(c1==charObj1);//True
		Character charObj2=new Character('Z');//Explicit
		
		Character charObj3='H';// Implicit boxing
		
		System.out.println("c1: "+c1);//A
		System.out.println("charObj1: "+charObj1);//A
		System.out.println("charObj2: "+charObj2);//Z
		System.out.println("charObj3: "+charObj3);//H
		
		boolean b=true;
		Boolean bObj=new Boolean(b);
		System.out.println(bObj==b);//true

	}

}
