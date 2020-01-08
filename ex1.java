package NewOne;

public class ex1 {
	public static void main(String[ ] args) {
	    try {
	      int myNumbers[] = {2,1,2}; 
	      myNumbers[0] = 100;
	      myNumbers[1] = 200;
	      System.out.println(myNumbers[1]);
	      System.out.println(myNumbers[0]);
	      System.out.println(myNumbers[29]);
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    }
	    finally {
	        System.out.println("The 'try catch' is finished.");
	      }
	  }
	}