import java.util.Scanner;
class  Factors
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("print factors of given number");
		int number=scan.nextInt();
		int a=1;
		for(a=1; a<=12; a++)
		{
			if(number%a==0)
			{
			System.out.println(a);
			}
		}
	}
}
