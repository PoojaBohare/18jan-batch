package All_Assieignments;

public class StarPyramyd {

	public static void main(String[] args) {
		printStar();
		revprintStar();
		
	}	
	
	static void printStar() {
		for(int i=0;i<5;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print(" * ");// for num pyramid we can print j
				
			}
			
			System.out.println();
		}
		System.out.println("************************************************");
	
	}
	
	
	
	static void revprintStar() {//
		for(int i=5;i>=0;i--) {
			for(int j=0; j<=i;j++) {
				System.out.print(" * ");// for num pyramid we can print j
				
			}
			
			System.out.println();
		}
	
	}
	
	
	
	

}
