class D4Ex5
{
	public static void main (String[]args)
	{
		int num[]=new int[10];
		num[0]=25;
		num[1]=25;
		num[2]=25;
		num[3]=25; 
		num[4]=25;
		num[5]=25;
		num[6]=25;
		num[7]=25;
		num[8]=25;
		num[9]=25;
		 
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]+" ");
		}
		System.out.println("******************************************");
		
		int num2[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<num2.length;i++)
		{
			System.out.println(num2[i]+" ");
		}
		System.out.println("#############################################");
		String days[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		for(String day:days)
		{
			System.out.println(day+"  ");
		}
    }
}