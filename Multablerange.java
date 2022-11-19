import java.util.Scanner;
class Multablerange
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the table");
		System.out.println("enter the minimum range");
		int x=scan.nextInt();
		System.out.println("enter the maximum range");
		int y=scan.nextInt();
		for (int n=3;n<=5;n++)
		{ 
			System.out.println("table is :"+n);
			for (int a=1;a<=10;a++ )
			{
				System.out.println(n+ " * " +a+ "="+n*a);
			}
			}
	}	
}
