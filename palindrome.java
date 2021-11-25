package tamilnadu.Chennai;

public class palindrome {

	public static void main(String[] args) {
		int purse = 1234321;
		int purse2 = purse;
		int reverse = 0;
		while(purse>0)
		{int rem = purse%10;
		reverse = (reverse*10) + rem;
		System.out.println(rem);
		purse = purse/10;
		
		}
System.out.println(reverse);
	
if (purse2 == reverse)
{
	System.out.println("Palindrome ");
	}
else {
	System.out.println("Not Polindrome");
	 {
		
	}
}
}
}