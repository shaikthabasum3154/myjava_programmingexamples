import java.util.Scanner;
class Spy_next
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		while (true)
		{
		    num++;
			int temp=num;
			int lastdigit=0;
			int sum=0;
			int product=1;
			while (temp>0)
			{
				lastdigit=temp%10;
				sum=sum+lastdigit;
				product=product*lastdigit;
				temp=temp/10;
			}
			if (sum==product)
			{
		   System.out.println(num);
		   break;
			}
		}
	}
}
