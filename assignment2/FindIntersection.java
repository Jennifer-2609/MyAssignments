package week1.assignment2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] num1 = {3,2,11,4,6,7};
		int[] num2 = {1,2,8,4,9,7};
		int a = num1.length;
		int b = num2.length;
		
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if(num1[i]==num2[i]) {
					System.out.println("matched item is " + num1[i]);
				}
			}
				
			}
		}
	}

