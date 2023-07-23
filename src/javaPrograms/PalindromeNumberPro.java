package javaPrograms;

public class PalindromeNumberPro {

	int r,a=0,n=7997,result;
	
	public void m1() {
		result=n;
		
		while(n!=0)
		{
			r=n%10;
			a=(a*10)+r;
			n=n/10;	
		}
		if(a==result)
		{
			System.out.println("It is a Palindrome Number");
		}
		else {
			System.out.println("It is not a Palindrome Number");
		}
		
	}
	
	public static void main(String[]args) {
		
		PalindromeNumberPro o=new PalindromeNumberPro();
		o.m1();
	
		
	}
	
	
	
	
	
}
