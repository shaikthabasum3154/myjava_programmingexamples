import java.util.Scanner;
class  Decoration
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("============================");
		System.out.println("enter 1 to decorate");
		System.out.println("enter 2 to cancel the decorate");
		System.out.println("==============================");
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println("are you ready????");
			System.out.println("enter true to say yes$$");
			System.out.println("enter false to say no$$");
			boolean decorate=scan.nextBoolean();
			if (decorate==true)
			{
				System.out.println("thank you...for ordering"+(char)2);
			}
			else
			{
                System.out.println("thank you...for ordering again!!"+(char)3);
			}
		}
			else
			{
				 System.out.println("thank you...for ordering again!!"+(char)2);
			}
		}
	



	}

