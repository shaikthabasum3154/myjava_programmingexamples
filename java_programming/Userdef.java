import java.util.Scanner;
class UserDef
{ 
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the user name");
		String name=scan.next();
		for(int i=1;i<=5;i++)
		{
			System.out.println(name);
		}
	}
}
