import java.util.Scanner;
class Serial_num1to100 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
	    int x=100;
		for (int a=2;a<=100;a++)
		{
			int count=0;
			for (int i=1;i<=100;i++)
			{
				if (a%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{ 
				System.out.println(a+"");
			}
		}
	}
}