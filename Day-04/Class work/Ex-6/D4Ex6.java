import java.util.Scanner;
class D4Ex6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size=sc.nextInt();
		int num[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the element"+(i+1)+":");
			num[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("elements of the array:");
		for(int number:num)
		{
			System.out.print(number+" ");
		}
	}
}