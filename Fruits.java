import java.util.Scanner;
class  Fruits
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("============================");
		System.out.println("enter 1 for apple");
		System.out.println("enter 2 to select any fruit");
		System.out.println("==============================");
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println("apple will take????");
		}
		else
		{
			System.out.println("any other fruits");
		}
	}

}			