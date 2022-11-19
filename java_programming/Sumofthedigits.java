import java.util.Scanner;
class  Sumofthedigits 
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
			sum=sum+lastdigit;
			num=num/10;
		}
		System.out.println("Sum of the digits is:"+sum);
	} 

}

