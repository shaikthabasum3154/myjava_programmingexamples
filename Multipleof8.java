import java.util.Scanner;
class Multipleof8 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter multiples of 8");
		int x=scan.nextInt();
		for (int a=1;a<=200;a++)
		{
		if (a%8==0)
		{
			System.out.println(a);
		}
		}
	}
}
