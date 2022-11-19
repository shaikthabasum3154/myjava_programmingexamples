import java.util.Scanner;
class  First_100
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int count=0;
		for (int a=1;a>=100;a++)
		{
			if (num%a==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println(count+"");
		}
	}
}
