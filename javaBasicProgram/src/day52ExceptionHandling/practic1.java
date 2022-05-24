package day52ExceptionHandling;

import java.util.Scanner;

public class practic1 {

	public static void main(String[] args) {
	System.out.println("program starts.........");
	int i = 10, j=0, k;//we can take j=0 for exception
	Scanner scn=new Scanner(System.in);
	try {
	k=i/j;
	System.out.println("Result "+k);
	}catch (Throwable e) {
		System.out.println("Exception handle...");
		System.out.println("Exception found. "+e);
		
	}
	System.out.println("program ends.......");
	
	}
}