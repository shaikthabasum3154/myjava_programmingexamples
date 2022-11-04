import java.util.Scanner;
class Exit 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("==============================");
		System.out.println("enter 1 to exit");
		System.out.println("enter 2 to continue shopping");
	    System.out.println("========================");
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println("are you sure????");
			System.out.println("enter true to say yes!!!!!");
			System.out.println("enter  false to say noo!!!!");
			boolean exit=scan.nextBoolean();
			if (exit==true)
			{
				System.out.println("thank you....visit again.."+(char)3);
			}
			else
			{
				System.out.println("thats great...!!keep shopping.."+(char)2);
			}
		}
		else
		{
			System.out.println("thats great...!!keep shopping.."+(char)3);
		}
	}
}
