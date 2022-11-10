import java.util.Scanner;
class User_defined
{ 
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the user name");
		String a=scan.next();
		for(int i=1;i<=5;i++)
		{
			System.out.println(a);
		}
	}
}
