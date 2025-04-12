import java.util.Scanner; 
  public class D5Ex01{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] Number = new int[5];
		int sum=0;
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter an integer:");
			Number[i]=sc.nextInt();
			sum=sum+Number[i];
		}
		System.out.println("sum is :"+sum);
	}
  }