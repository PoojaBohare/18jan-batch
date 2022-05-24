package MyWrittenPrograms;

class p {
	p(){
		System.out.println("I am constructor of cass p");
			
		}
	void dispay() {
		System.out.println("I am constructor of cass p");
		
	}	
}
class p2{
	p2(int i){
		System.out.println("I am constructor of cass p");
		
	}
	p2(){
		
	}
	p2(double r){
		
	}
	p2(char a){
		
	}
}


public class Constructor1 {

	public static void main(String[] args) {
		p p1 = new p();
		p1.dispay();
		p2 s1 = new p2();
		p2 s2 = new p2(10);
		p2 s3 = new p2('a');
		p2 s4 = new p2(10.10);
		

	}

}
