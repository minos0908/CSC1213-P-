import java .util.Scanner;
public class D4Ex1{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("The number is:");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=num)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("The sum is: "+sum);
	}
}
