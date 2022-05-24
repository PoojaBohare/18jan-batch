package MyWrittenPrograms;
//write a program for using method n loop number n decending order

public class ForLoop {
	 
	public void reverseNymbers() {
		for(int i =100;i>=0;i--) {
		System.out.println(i);	
		}
	}

	public static void main(String[] args) {
		
         ForLoop p = new ForLoop();
        p.reverseNymbers();
	}

}
