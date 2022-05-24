package All_Assieignments;

public class tempPyramid {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		
		System.out.println("***********************************************");
		
		//by using while loop
		int i=0; 
		while(i<5) {
			int j=0;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
		System.out.println("***********************************************");
		
		int p=22;
		
		if(p%2==0) {
			System.out.println("number is even");
			
		}else {
				System.out.println("number is odd");
			}
		
	
		System.out.println("***********************************************");
		
		for(int i2=0; i2<10; i2++) {
			
			System.out.println("Pooja Pawan");
			
		}
		
}
}