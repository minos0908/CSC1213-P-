import java.util.Scanner;
class D3Ex1{
	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=ob.nextInt();
		
		if(n>0)
		{  
	       System.out.println("Possitive number");
		}
		else if(n==0)
		{
			System.out.println("Number is zero");
		}
		else
		{
			System.out.println("Negative number");
		}
	}
}
			