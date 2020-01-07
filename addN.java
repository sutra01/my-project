package NewOne;

public class addN {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1; 
		int sum = 0;
		long mul = 1;
	/*	for (i=0; i<=20; i++) {
			
			sum = sum + i;
		} */
		
	while(i<=0) {
			
			sum = sum + i;
			mul = mul * i;
			i++;
		} 
		
	/*	do {
			
			sum = sum + i;
			mul = mul * i;
			i++;
			
		} while (i<=1); */
			
		
		System.out.println("The Sum of N numbers is :" + sum);
		System.out.print("The Multipication of N numbers is :" + mul);

	}

}
