package NewOne;

public class caseExample {

	public static void main(String[] args) {
		
		int[] marks = {35,65,70,45,25,89,90};
		int i;
		
	    for(i=0; i<marks.length;  i++) {
	    	
	    	if (marks[i] < 35) {
	    		
	    		System.out.println("MARKS : " + marks[i] + " - FAIL");
	    		
	    	} else if (marks[i] < 50) {
	    			
	    			System.out.println("MARKS : " + marks[i] + " - GRADE C");
	    		} else if (marks[i] < 60 ) {
	    			
	    			System.out.println("MARKS : " + marks[i] + " - GRADE B");
	    			
	    		} else if (marks[i] < 75) {
	    			
	    			System.out.println("MARKS : " + marks[i] + " - GRADE A");
	    			
	    		} else { System.out.println("MARKS : " + marks[i] + " - GRADE A+");
	    	}
	    }
		
		      
}
}
