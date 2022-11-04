import java.util.Scanner;
class  Park
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter valid input");
		char park=scan.next().charAt(0);
		if (category=='M'||category=='m')
		{
			System.out.println("enter 100rupees"); 
		}
		else if (category=='F'||category=='f')
		{
			System.out.println("ente 80rupees");
		}
		else if (category=='T'||category'f')
		{
			System.out.println("enter 20rupees");
		}
		else if (category=='C'||category=='c')
		{
			System.out.println("enter 5rupees");
		}
		else if (category=='S'||catogiry=='s')
		{
			System.out.println("enter free");
		}
	
	else
	{
		System.out.println("any other character");
	}
}
}

