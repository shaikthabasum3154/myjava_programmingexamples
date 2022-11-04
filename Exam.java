import java.util.Scanner;
class Exam
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=scan.nextInt();
		if  (marks>=35)
		{
			System.out.println("person is pass");
		}
		else
		{
		System.out.println("person is failed");
		}
	}
}