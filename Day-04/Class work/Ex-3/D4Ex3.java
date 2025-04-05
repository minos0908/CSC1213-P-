import java.util.Scanner;
public class D4Ex3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		char control=' ';
		int EvenConter=0,Oddconter=0;
		int Sumeven=0;
		do
		{
			System.out.println("Enter the number to find the summation:");
			int num=sc.nextInt();
			if(num%2==0)
				EvenConter=EvenConter+1;
			else
				Oddconter=Oddconter+1;
			System.out.println("Do you want to continue:");
			control=sc.next().charAt(0);
		}
		while(control=='Y'|| control =='y');
		System.out.println("count the even number of user has entered is:"+EvenConter);
		System.out.println("count the odd number of user has entered is:"+Oddconter);
	}
} 
