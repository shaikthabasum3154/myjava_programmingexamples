import java.util.Scanner;
class First100primenumbers
{
  public static void main(String[]args)
	{
        Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int y=1;
		for (num=1;y<=100;num++)
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
