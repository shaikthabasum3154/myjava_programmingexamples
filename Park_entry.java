import java.util.Scanner;
class Park_entry
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter park entry fees");
		char category=scan.next().charAt(0);
		switch(category)
		{
			case 'm' :
				System.out.println("for male 100rupee");
			break;
			case 'f':
				System.out.println("for female 50rupees");
			break;
			case 't':
				System.out.println(" for trans 20 rupees");
			break;
			case 'c':
				System.out.println("for 5 rupees");
			break;
			default:
				System.out.println("enter valid input");
		}
		

	}
}
