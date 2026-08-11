import java.util.Scanner;
public class vowelconsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter char: ");
		char ch;
		ch=sc.nextLine().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");break;
	    default:
			System.out.println("consonant");break;
			
		}	
	} 
	}