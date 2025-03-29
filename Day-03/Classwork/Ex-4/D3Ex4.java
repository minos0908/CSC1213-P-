import java.util.Scanner;
class D3Ex4{
	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a letter:");
		char vowels=ob.next().charAt(0);
		switch(vowels){
			case 'A':  case 'E':  case 'I':  case'O':  case'U':
			case 'a':  case 'e':  case 'i':  case'o':  case'u':
			System.out.println("It is vowels");
			break;
			default:System.out.println("Odd number");
		}
	}
}