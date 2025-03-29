import java.util.Scanner;
class Details{
	public static void main(String[] args ){
		String fname;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your firstname:");
		fname=sc.nextLine();
		
		System.out.println("Enter your lastname:");
		String lname=sc.nextLine();
		
		System.out.println("Enter your Registeration No:");
		String RegNo=sc.next();
		
		System.out.println("Enter your Sex (M/F):");
		char Sex=sc.next().charAt(0);
		
		System.out.println("Enter your Mobail No:");
		long PhoneNo=sc.nextLong();
		
		System.out.println("Enter your Age:");
		int Age=sc.nextInt();
		
		System.out.println("Enter your GPA:");
		double GPA=sc.nextDouble();
		
		
		
		
		System.out.println("fullname:"+fname+" "+lname+"\n"+"Registeration No:"+ RegNo+"\n"+"Sex (M/F):"+Sex+"\n"+"Mobail No:"+PhoneNo+"\n"+"Age:"+Age+"\n"+"GPA:"+GPA);
	}
}
