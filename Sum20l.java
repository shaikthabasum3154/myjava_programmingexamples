import java.util.Scanner;
class Sum20l 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the sum of 20 natural numbers");
		int sum=scan.nextInt();
		int number=scan.nextInt();
		for(int a=1;a<=20;a++)
		{
			sum=sum+a;
		System.out.println("sum of 20 natural number is:"+sum);
		}
		
	}
}
