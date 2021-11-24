package tamilnadu.Chennai;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60,70,80,90,100,120,140};
		System.out.println("Enter the number to Search:");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int s=0,e = ar.length-1;
		while(true) {
		int m = (s+e)/2;
		if (key == ar[m])
		{
			System.out.println("Found key at position:" + m);
			break;
		}
		else if(key<ar[m])
		{
			e=m-1;
		}
		else {
			s = m+1;
		}
		}}}