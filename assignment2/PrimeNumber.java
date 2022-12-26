package week1.assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13;
		
		for (int i = 2; i <= input; i++) {
			if(input%i==0) {
				System.out.println(input+ "is a Prime Number");
			}
			else {
				System.out.println("It is not a Prime Number");
			}
		}
			
	}
		}
	
	
	

