import java.util.Scanner;
class Fibonacci_reverse 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<n;i++)
		{
			a=b;
			b=sum;
			sum=a+b;
		}
		for (int j=n;j>0;j-- )
		{
			System.out.println(j+") "+sum);
			sum=b;
			b=a;
			a=sum-b;
		}
	}
}