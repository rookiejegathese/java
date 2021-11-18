package tamilnadu.Chennai;
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		Array4 ar = new Array4();
		ar.find();
		}
private void find() {
		String[] list = {"jegathese","niranjan","nethra","kishore"}; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to search");
		 String name = sc.nextLine();
		 boolean got = false;
		 for (int i=0; i<list.length; i++)  
		{  
			 if(name == list[i])
			 {
				 System.out.println("String is found in the index");
				 got = true;
				 break;
			 } }
			 if(got==false)
			 {
	                System.out.println(" String is not found in the index");  
	        }  
		
}}
