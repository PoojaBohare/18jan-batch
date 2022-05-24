package day51WrapperClass;


class Demo1223{
	private Demo1223() {//constructor
		System.out.println("I am zero-param");
	}
	static Demo1223 d1=new Demo1223();   //obj
	String name="Pune";
	static Demo1223 getInstance() {    // method 
		return d1;     //return ref veriable 
	}
	 void print() {   //method
		 System.out.println("I am print() of Singleton class Demo1223 ");
	 }
}
public class SingletonClass2 {

	public static void main(String[] args) {
		//Demo1223 d1=new Demo1223();//compile time error due to singleton class concept
				//or
		Demo1223 xyz=Demo1223.getInstance();//d1--->new Demo1223();
		xyz.print();
		System.out.println(xyz.name);//Pune
		xyz.name="Bangalore";
		System.out.println("d1 ref: "+xyz.name);//Bangalore
		Demo1223 d2=Demo1223.getInstance();
		System.out.println("d2 ref: "+d2.name);//Bangalore
		
		SingletonClass2 s1=new SingletonClass2();
		
		SingletonClass2 s2=s1;
		
		//SingleObject sx=SingleObject.getSampletonObject();
		//sx.display();
	}

}