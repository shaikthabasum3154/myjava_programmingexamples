import java.util.Scanner;
class  Strong1to50000
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		for (num=1;num<=50000;num++)
		{
		int y=1;
		int lastdigit=0;
		int temp=num;
		int sum=0;
		while (num>0)
		{
			lastdigit=num%10;
			int factorial=1;
		   for (int a=1;a<=lastdigit;a++)
		{
		  factorial=factorial*a;
		}
		
		   sum=sum+factorial;
           num=num/10;
		}
		    num=temp;
			
				if(sum==temp)
				{
			System.out.println("print the :"+temp);
			      y++;
		      }
		
			
			}
		}
	}

