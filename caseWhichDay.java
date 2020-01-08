package NewOne;
import java.util.Scanner;

public class caseWhichDay {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Create a Scanner object
	   
		System.out.print("Enter Day --> ");

	    int day = input.nextInt();  // Read user input
	    
	    switch(day){
	    	case 1:
	    		System.out.println("Today is Monday");
	    		break;
	    	case 2:
	    		System.out.println("Today is Tuesday");
	    		break;
	     	case 3:
	    		System.out.println("Today is Wednesday");
	    		break;
	    	case 4:
	    		System.out.println("Today is Thursday");
	    		break;
	    	case 5:
	    		System.out.println("Today is Friday");
	    		break;
	    	case 6:
	    		System.out.println("Today is Saturday");
	    		break;
	    	case 7:
	    		System.out.println("Today is Sunday");
	    		break;
	    }
	 
	    input.close();
	}

}
