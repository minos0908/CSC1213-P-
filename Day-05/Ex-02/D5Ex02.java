import java.util.Scanner;
public class D5Ex02
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		int Number[] = new int[10];
		for(int i=0; i<10; i++)
		{
			System.out.print("Enter an integer:");
			Number[i]=ob.nextInt();
		
		}
		
		for(int number:Number)
		{
			System.out.print(number+"\t");
		}
		System.out.println();
		String Days[]=new String[7];
		Days[0]="Monday";
		Days[1]="Tuesday";
		Days[2]="Wednesday";
		Days[3]="Thursday";
		Days[4]="Friday";
		Days[5]="Saturday";
		Days[6]="Sunday";
		for(String Day:Days)
		{
			System.out.println(Day+"\t");
		}
		
	}
}