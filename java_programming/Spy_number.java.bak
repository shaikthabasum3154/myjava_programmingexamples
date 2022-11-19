import java.util.Scanner;
class  Spy_number
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int temp=num;
		int lastdigit=0;
		int sum=0;
		int product=1;
		while (num>0)
		{
			lastdigit=num%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			num=num/10;
		}
	
	if (sum==product)
	{
		System.out.println("spy number");
	}
	else 
		System.out.println("not a spy number");
}
}


