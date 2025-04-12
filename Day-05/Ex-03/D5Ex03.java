import java.util.Scanner;
public class D5Ex03
{	
public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		int Number[] = new int[5];
		for(int i=0; i<=4; i++)
		{
			System.out.print("Enter an integer:");
			Number[i]=ob.nextInt();
		
		}
		
		for(int number:Number)
		{
			System.out.print(number+"\t");
		}
		
		int min = Number[0];
		int max =Number[0];
		
		for(int i=0; i<=4; i++){
			
		if(Number[i] > max)
		{
			max=Number[i];
		}
		if(Number[i]< min)
		{
			min=Number[i];
		}
		}
		
		System.out.println("The maximum value is:"+max);
		System.out.println("The minimum value is:"+min);
	}
}