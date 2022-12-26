package week1.assignment2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343;
		int reverse = 0;
		
		for (int i = 0; i < 1; i++) {
			reverse = num%10;
			int b=reverse;
			if(b==num) {
			System.out.println("Palindrome Number");
		}
			else {
				System.out.println("Not a Palindrom");
			}
		}
	}
}
