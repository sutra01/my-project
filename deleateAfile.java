package NewOne;
import java.io.File;  // Import the File class
import java.util.Scanner;

public class deleateAfile {
  public static void main(String[] args) { 
	 
	Scanner fname = new Scanner(System.in);
	System.out.println("Enter a File name");
	String filename = fname.next();
	filename = ("E:\\" + filename);
	System.out.println(filename);
    File myObj = new File(filename); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
    fname.close();
  } 
}

