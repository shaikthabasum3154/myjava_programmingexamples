import java.util.Scanner;
class Magicnumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int sum=0;
		for (int a=1;a<=num;a++)
		{
			sum=sum+a;
		}
		if (num>1)
		{
			System.out.println("magic number");
		}
		else
		{
			System.out.println("not a magical number");
		}
	}
}
