package gettingInputs;

public class vowel {
	public static void main(String[] args) {
		char l='u';
		
		
		//if(l=='a'|| l=='e'|| l=='i'||l=='o'||l=='u' ) {
			//System.out.println("The letter is vowel");
		//}
		//else {
		//	System.out.println("The letter is consonant");
		//}
		
		
		switch(l) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println("Character is vowel");
			break;
		default:
			System.out.println("char is consonant");
		}
		
	}

}
