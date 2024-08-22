package gettingInputs;

import java.util.Scanner;

public class swapnumber {
	
	public void swap() {
		
		System.out.println("Enter the first number: ");
		Scanner reader = new Scanner(System.in);
		int num1 =reader.nextInt();
		
		
		System.out.println("Enter the second number: ");
		//Scanner reader1 = new Scanner(System.in);
		int num2 =reader.nextInt();
		
		
		int num3;		
		num3=num1;
		num1=num2;
		num2=num3;
		
		System.out.println("N1: " +num1);
		
		System.out.println("N2: " +num2);
		
	}
	
	public static void main(String[] args) {
		swapnumber obj= new swapnumber()	;
		obj.swap();
	}

}
