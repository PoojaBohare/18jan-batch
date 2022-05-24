package InterviewPrograms;


public class ReverseNumber {

	public static void main(String[] args) {
		
     int no=1234; int rev=0;int rem=0;
     
	while(no!=0)
     {
		rem=no%10;//4
		rev=rev*10 + rem;//0*10+4=4
		no=no/10;//123
    	 
     }
	
		
		System.out.println("Reverse Number is "+ rev);

	}

}
// 1ST WE ARE LOOKING FOR MODULERS...