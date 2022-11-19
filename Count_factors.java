import java.util.Scanner;
class Count_factors
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the count of the factors");
		int num=scan.nextInt();
		int count=0;
		for (int i=1;i<=num;i++ )
		{
			if (num%i==0)
			{
				System.out.println(i);
				count++;
			}
		}
			System.out.println("tha count is:"+count);
		
	}
}
