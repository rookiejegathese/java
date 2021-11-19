package tamilnadu.Chennai;
import java.util.Scanner;
public class Sorting {
public static void main(String[] args) {
		String shift;
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Want to shift your array");
		    shift= sc.nextLine();
		 	 switch (shift) {
		    case "sortrightonce":int[] ar = {10,5,7,9,8}; 
		    System.out.println("Your Array before shifting right once");
		    for(int i=0;i<ar.length;i++)
		      System.out.print(ar[i]+ "|");
		    System.out.println();
		    int temp = ar[ar.length-1]; //8
		    for(int i =ar.length-1; i>=1;i--)
		    {
		      ar[i] = ar[i-1];
		    } 
		       ar[0] = temp; 
		    
		      System.out.println("Your Array after shifting right once");
		      for(int i=0;i<ar.length;i++)
		        System.out.print(ar[i]+ "|");
		      System.out.println();
			
	            	            break;
		       case "sortlefttwice":int[] ar1 = {10,5,7,9,8};
			  System.out.println("Your Array before shifting left twice");
			    for(int i=0;i<ar1.length;i++)
			      System.out.print(ar1[i]+ " | ");
			    System.out.println();
			    int t1 = ar1[0]; 
			    int t2 = ar1[1]; 
			    for(int i=0;i<=2;i++)
			    {
			    ar1[i] = ar1[i+2];
			    }

			    ar1[3] = t1;
			    ar1[4] = t2; 
			    System.out.println("Your Array after shifting left twice");
			    for(int i=0;i<ar1.length;i++)
			      System.out.print(ar1[i]+ " | ");
			    System.out.println();
			    break;
		       case "sortleftonce":	 int[] ar12 = {10,5,7,9,8}; 
			    System.out.println("Your Array before shifting left once");
			    for(int i=0;i<ar12.length;i++)
			      System.out.print(ar12[i]+ "|");
			    System.out.println();
			    int temp1 = ar12[0]; //10
			    for(int i =0; i<ar12.length-1;i++)
			    {
			      ar12[i] = ar12[i+1];
			    }
			    ar12[ar12.length-1] = temp1;  //  8
			    
			      System.out.println("Your Array after shifting left once");
			      for(int i=0;i<ar12.length;i++)
			        System.out.print(ar12[i]+ "|");
			      System.out.println();
 break;
		       case "sortrighttwice":int[] ar5 = {10,5,7,9,8}; 
				 for(int count=1;count<=2;count++)
				  {
				    System.out.println("Your Array before shifting right twice");
				    for(int i=0;i<ar5.length;i++)
				      System.out.print(ar5[i]+ "|");
				    System.out.println();
				    int temp16 = ar5[ar5.length-1]; //8
				    for(int i =ar5.length-1; i>=1;i--)
				    {
				      ar5[i] = ar5[i-1];
				    }
				       ar5[0] = temp16;  //  8
				    
				      System.out.println("Your Array after shifting");
				      for(int i=0;i<ar5.length;i++)
				        System.out.print(ar5[i]+ "|");	
				      System.out.println();
				      }

		    	   break;
				  }}
			

		    

//	private void sortlefttwice() {
//		  int[] ar = {10,5,7,9,8};ar1ar1
//		  System.out.println("Your Array before shifting left twice");
//		    for(int i=0;i<ar.length;i++)
//		      System.out.print(ar[i]+ " | ");
//		    System.out.println();
//		    int t1 = ar[0]; 
//		    int t2 = ar[1]; 
//		    for(int i=0;i<=2;i++)
//		    {
//		    ar[i] = ar[i+2];
//		    }
//
//		    ar[3] = t1;
//		    ar[4] = t2; 
//		    System.out.println("Your Array after shifting left twice");
//		    for(int i=0;i<ar.length;i++)
//		      System.out.print(ar[i]+ " | ");
//		    System.out.println();
//		
//	}
//
//	private void sortleftonce() {
//		 int[] ar = {10,5,7,9,8}; 
//		    System.out.println("Your Array before shifting left once");
//		    for(int i=0;i<ar.length;i++)
//		      System.out.print(ar[i]+ "|");
//		    System.out.println();
//		    int temp = ar[0]; //10
//		    for(int i =0; i<ar.length-1;i++)
//		    {
//		      ar[i] = ar[i+1];
//		    }
//		    ar[ar.length-1] = temp;  //  8
//		    
//		      System.out.println("Your Array after shifting left once");
//		      for(int i=0;i<ar.length;i++)
//		        System.out.print(ar[i]+ "|");
//		      System.out.println();
//	}

	private void sortrightonce() {
		int[] ar = {10,5,7,9,8}; 
	    System.out.println("Your Array before shifting right once");
	    for(int i=0;i<ar.length;i++)
	      System.out.print(ar[i]+ "|");
	    System.out.println();
	    int temp = ar[ar.length-1]; //8
	    for(int i =ar.length-1; i>=1;i--)
	    {
	      ar[i] = ar[i-1];
	    }
	       ar[0] = temp;  //  8
	    
	      System.out.println("Your Array after shifting right once");
	      for(int i=0;i<ar.length;i++)
	        System.out.print(ar[i]+ "|");
	      System.out.println();
		
	}

	public void sortrighttwice() {
		int[] ar = {10,5,7,9,8}; 
		 for(int count=1;count<=2;count++)
		  {
		    System.out.println("Your Array before shifting right twice");
		    for(int i=0;i<ar.length;i++)
		      System.out.print(ar[i]+ "|");
		    System.out.println();
		    int temp = ar[ar.length-1]; //8
		    for(int i =ar.length-1; i>=1;i--)
		    {
		      ar[i] = ar[i-1];
		    }
		       ar[0] = temp;  //  8
		    
		      System.out.println("Your Array after shifting");
		      for(int i=0;i<ar.length;i++)
		        System.out.print(ar[i]+ "|");	
		      System.out.println();
		      }
	}}
