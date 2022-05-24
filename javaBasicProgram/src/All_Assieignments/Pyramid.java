package All_Assieignments;

public class Pyramid {

	public static void main(String[] args) {
	
		//
		
		for(int i=0; i<5; i++) {//number of line in pyramid
			
			for(int j=5-i; j>1;j--) {//defines format for pyramid like spaces
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {//prints the number or symbol required in pyramid
				System.out.print("* ");//for numbers k
				
			}
			System.out.println();
			
		}
      //OR Revrese pyramid
	System.out.println("****************************************************");	
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
				
			}
			
			for(int k=i;k<5;k++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
	}

}
