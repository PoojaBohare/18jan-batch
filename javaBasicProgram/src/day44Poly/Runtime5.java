package day44Poly;
class Bike {
	int speedlimit = 90;
}

class Honda3 extends Bike {
	int speedlimit = 150;
}
public class Runtime5{
	public static void main(String args[]){  
	  Bike obj=new Honda3();
	  System.out.println(obj.speedlimit);//90
	}
}


//intervie que may be 
// variable overriding se poly achive nahi hota ye runtime poly ka  exaple nahi he
