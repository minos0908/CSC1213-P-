import java.util.Scanner;
class D4Ex4{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size=sc.nextInt();
		int num1[]=new int[size];
		for (int i=0;i<num1.length;i++)
		{
			System.out.print("Enter the element"+(i+1)+":");
			num1[i]=sc.nextInt();
		}
		System.out.print("Array elements:");
		
		for (int i=0;i<num1.length;i++)
		{
			System.out.print(num1[i]+" ");
		}
		int max=num1[0]=45;
	    int min=num1[0]=45;
		int sum=0;
		double average;
		
		for (int i=0;i<num1.length;i++)
			
			{
				if(num1[i]>max)
				{
					max=num1[i];
				}
				if(num1[i]<min)
				{
					min=num1[i];
				}
				sum +=num1[i];
			}
			average=(double)sum/num1.length;
			System.out.println("maximum element:"+max);
			System.out.println("minimum element:"+min);
			System.out.println("summation:"+sum);
			System.out.println("average:"+average);
			System.out.println("Enter the element you want to search:");
			int searchelement=sc.nextInt();
			boolean found =false;
			for (int i=0;i<num1.length;i++)
			{
				 if(num1[i]==searchelement)
				 {
				  System.out.println("element found at position:"+(i+1));
				  found=true;
				  break;
				 }
			}
			if(!found)
			{
				System.out.println("element not found");
			}
			boolean isunique=true;
			for (int i=0;i<num1.length;i++)
			{ 
		       for (int j=0;j<num1.length;j++)
			   {
				   if(num1[i]==num1[j])
				   {
					   isunique=false;
					   break;
				   }
			   }
				   if(!isunique)
				   {
                       break;
				   }
			}				   
				    if(isunique)
				   {
					   System.out.println("All elements are unique");
				   }
				   else
				   {
					   System.out.println("not unique-duplicate elements exist");
				   }
        }
    }
			
	