
import java.util.Scanner;
class  Sumandfactorial
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int lastdigit=0;
		
        int sum=0;
		while (num>0)
		{
			
			
			lastdigit=num%10;
			int f=1;
			for (int a=lastdigit;a>=1 ;a-- )
			{
				f=f*a;
			}
			sum=sum+f;
			num=num/10;
			
		}
		System.out.println("factorial of the digits is:"+sum);
	} 
}
