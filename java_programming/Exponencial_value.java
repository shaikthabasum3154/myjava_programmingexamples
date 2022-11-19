import java.util.Scanner;
class Exponencial_value
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the base value");
		int x=scan.nextInt();
		System.out.println("enter the power value");
		int y=scan.nextInt();
		int exp=x;
		for (int a=1;a<y;a++)
		{
		exp=exp*x;
		}
		System.out.println("exponent value is:"+exp);
	}
}
			
			