import java.util.Scanner;
class  Marks_result
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter valid input");
		int marks=scan.nextInt();
		if (marks>=90&&marks<=100)
		{
			System.out.println("enter the first rank");
		}
		else if (marks>=80&&marks<=89)
		{
          System.out.println("enter the second rank");

		}
		else if (marks>=70&&marks<=79)
		{
		  System.out.println("enter the first class");
		}
		else if (marks>=50&&marks<=69)
		{
			System.out.println("enter the second class");
		}
		else if (marks>=35&&marks<=49)
		{
			System.out.println("enter the just pass");
		}
		else if (marks>=0&&marks<=34)
		{
			System.out.println("enter the fail");
	}
        else
	    {
		System.out.println("enter any other integer");

		}
	}
}
