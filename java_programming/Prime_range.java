import java.util.Scanner;
class Prime_range  
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter minimum number");
		int m=scan.nextInt();
		System.out.println("enter maximum number");
		int n=scan.nextInt();
		int y=1;
		for (int num=m;num<=n;num++)
		{
			int count=0;
			for (int a=1;a<=num;a++)
			{ 
				if (num%a==0)
			{
					count++;
			}

		}
		if (count==2)
		{
			System.out.println(y+")"+num);
			y++;
		}

		}
	}
}
