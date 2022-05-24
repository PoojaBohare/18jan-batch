package day26Inheritance;

class show{
	static {
		System.out.println("static block..");//1
	}
	static int plsShow(int a ){
		return a;
	}

}

class picture extends show{
	int age=30;
	double salary = 25000;
	
	picture(){
		System.out.println("Print me I am picture.. ");
	}
	{
		System.out.println("I am Block of picture class...");//2
	}

	void play() {
		System.out.println("I am method of class picture.. ");//3
		System.out.println("Age " +age );//4
		System.out.println("Salary " +salary );//5
	
		
		
	}
	
}
public class InheritanceBySelfPractice {

	public static void main(String[] args) {
		picture pic = new picture();
		pic.play();
		show sh = new show();
		sh.plsShow(25);
		
		
		
	}

}
