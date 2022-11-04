import java.util.Scanner;
class  Voting
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the persons age for vote");
		int age=scan.nextInt();
		if (age>=18)
		{
			System.out.println("eligible for voting");
		}
	else
		{
		System.out.println("not eligible for vote");
		}
	}
}
