package week1.assignment2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		int[] brr = {1,2,3,4,7,6,8};
		
		 Arrays.sort(brr);
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=brr[i]) {
			System.out.println(arr[i]);
			break;
		}
	}
}
}