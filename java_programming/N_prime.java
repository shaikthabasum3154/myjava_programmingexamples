import java.util.Scanner;
class N_prime
{
  public static void main(String[]args)
	{
        Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int y=1;
		for (int i=1;y<=n;i++)
		{
			int count=0;
			for (int a=1;a<=i;a++)
			{ 
				if (i%a==0)
			{
					count++;
			}

		}
		if (count==2)
		{
			System.out.println(y+")"+i);
			y++;
			
		}

		}
	}
}
