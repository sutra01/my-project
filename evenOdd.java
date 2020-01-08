package NewOne;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num;
		int[] even = {};
		int[] odd = {};
		
		System.out.println("Enter any number : ");
		num = input.nextInt();
		
		for(int i=0; i<num; i++) {
			
			if (i%2 == 0){
				
				even[i] = i;
				System.out.println("This is a Even Number: " + i);
			}
		}
		
		for(int j=0; j<even.length; j++){
			System.out.println(even[j]);
		}
		

	}

}
