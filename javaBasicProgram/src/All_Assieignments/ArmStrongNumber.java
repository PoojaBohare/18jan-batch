package All_Assieignments;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		//for only 3 digit program
		isArmStrong(153);
		
		//System.out.println(isArmStrong(153));//123

	}
	
	static boolean isArmStrong(int num) {//num is actual no iske sath pura khel khelenge
		int temp,rem=0;//temp rakhenge bad me validation krane ke liye,,,,,//agar num aur sum palemdrom hokar aye to armstrong nahito nahi
		double sum =0;
		temp=num;
		while(temp>0) {
			rem=temp%10;
			sum=sum+Math.pow(rem, 3);//Math fun se power vala kam ho raha he
			temp=temp/10;
			
		}
		if (num==sum) {
			return true;
			
		}else
			return false;
		
	}
	
	//OR for more than 3 digit
	static boolean test(int num) {
		int temp, ct=0, rem=0;
		double sum =0;
		temp=num;
		while(temp>0) {
			temp=temp/10;
			ct++;
			
		}
		temp=num;
		while(temp>0) {
			rem=temp%10;
			sum=sum+Math.pow(rem,ct);
			temp=temp/10;
			}
		if(sum==num) {
			return true;
			
		}else
			return false;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
