import java.util.Scanner;
class Bill 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter bill amount");
		int bill=scan.nextInt();
		if(bill>=5000)
		{
			System.out.println("discount 20 ");
		}
		else
		{
			System.out.println("10 disscount");
		}


	}
}
