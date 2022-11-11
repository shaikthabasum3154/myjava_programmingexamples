import java.util.Scanner;
class Mul_range 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter minimum range");
		int x=scan.nextInt();
		System.out.println("enter maximum number");
		int y=scan.nextInt();
		System.out.println("enter a number to print multiples");
		int n=scan.nextInt();
		for (int a=x;a<=y;a++ )
		{
			if(a%n==0)
			{
		    System.out.println(a);
			}
		}

	}
}
