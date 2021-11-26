package tamilnadu.Chennai;
import java.util.Scanner;
public class Arraysort {

			public static void main(String[] args) {
				 int[] ar = {10,5,7,9,8}; 
				 Sorting s = new Sorting();
				 s.sortrightonce();
			}
		  private void sortrightonce() {
			  int[] ar = {10,5,7,9,8};
			  System.out.println("Your Array before shifting left twice");
			    for(int i=0;i<ar.length;i++)
			      System.out.print(ar[i]+ " | ");
			    System.out.println();
			    int t1 = ar[0]; 
			    int t2 = ar[1]; 
			    for(int i=0;i<=2;i++)
			    {
			    ar[i] = ar[i+2];
			    }

			    ar[3] = t1;
			    ar[4] = t2; 
			    System.out.println("Your Array after shifting left twice");
			    for(int i=0;i<ar.length;i++)
			      System.out.print(ar[i]+ " | ");
			    System.out.println();
			


	}

}
