package javaPrograms;

public class ArmstrongNumberPro {

		int r,arm=0,n=407,result;
		
		public void m1() {
			result=n;
			while(n!=0)
			{
				r=n%10;
			  arm=arm+(r*r*r);
			    n=n/10;
			 
			}
		if(arm==result)
		{
			System.out.println("It is a Armstrong Number");
		}
		else {
			System.out.println("It is not a Armstrong number");
		}
			
	}
		public static void main(String[]args) {
			
			ArmstrongNumberPro o=new ArmstrongNumberPro();
			o.m1();
			
		}
	
	
	
	
	
	
}
