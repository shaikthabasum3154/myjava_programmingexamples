import java.util.Scanner;
class Grade_result 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the grade");
		char a=scan.next().charAt(0);
		switch(a)
		{
			case 'a':
		           System.out.println(" enter first rank");
			break;
			case 'b':
				   System.out.println("enter second rank");
			break;
			case 'c':
				System.out.println("enter first class");
			break;
			case 'd':
				System.out.println("enter second class");
			break;
			case 'e':
				System.out.println("fail");
			break;
		}

	}
}
