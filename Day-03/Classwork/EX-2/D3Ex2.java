import java.util.Scanner;
class D3Ex2{
	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n1=ob.nextInt();
		 
		System.out.println("Enter a number:");
		int n2=ob.nextInt();
		
		System.out.println("Enter a number:");
		int n3=ob.nextInt();
		
		if(n1>n2&&n1>n3)
		{ 
	       System.out.println("Maxiumam number is:"+n1);
		}
		else if(n2>n1&&n2>n3)
		{ 
	       System.out.println("Maxiumam number is:"+n2);
		}
			
		else 
		{ 
	       System.out.println("Maxiumam number is:"+n3);
		}
		
	}
}