import java.util.Scanner;
class Min_Max
{ 
	public static void main(String[] args) 
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter minimum range");
		int num1=scan.nextInt();
		System.out.println("enter maximum range");
		int num2=scan.nextInt();
		int sum=0;
        System.out.println("sum of natural numbers from 20 to 24");
		for (int a=num1;a<=num2;a++ )
		{
			
			sum=sum+a;
			System.out.println(sum);
		}
		
	}
}
