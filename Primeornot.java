import java.util.Scanner;
class  Primeornot 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int count=0;
		for (int a=1;a<=num;a++)
		{
			if (num%a==0)
			{
				count++;
			}
		}
	       if(count==2)
	        {
	        System.out.println("prime");
	         }
	       else
	      {
		    System.out.println("not a prime");
          }
}
}
