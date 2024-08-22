package gettingInputs;

//import java.util.*;

public class quotientRemainder {
	int quotient,remainder;
	
	
	public quotientRemainder(int num1, int num2) {
		
		//Scanner reader= new Scanner(System.in);
		quotient=num1/num2;
		remainder=num1%num2;
		System.out.println("quotient is " +quotient);
		System.out.println("reminder is " +remainder);
		
	}
	
	public static void main(String[] args) {
		quotientRemainder obj= new quotientRemainder(10, 3);
		System.out.println(obj.quotient);
	
		
	}

}
