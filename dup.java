package NewOne;

public class dup {

	public static void main(String[] args) {
		String str = new String();
		str = "leela";
		// TODO Auto-generated method stub
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean isDup;
		for (int i = 0; i < chars.length; i++) {
		    isDup = false;
		    for (int j = i + 1; j < chars.length; j++) {
		        if (chars[i] == chars[j]) {
		            isDup = true;
		            break;
		        }
		    }
		    if (!isDup) {
		        //sb.append(chars[i]);
		        System.out.print(chars[i]);
		    }
		}

	}

}
