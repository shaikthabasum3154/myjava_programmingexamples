import java.util.Scanner;
class Next_fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");            
	     int n=scan.nextInt();
	      while(true)
		{
		  n++;
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;sum<=n;i++)
		
		{ 
		
			a=b;
			b=sum;
			sum=a+b;
			                                                       
		}
		System.out.println(sum);
		break;
		}
			}
}
