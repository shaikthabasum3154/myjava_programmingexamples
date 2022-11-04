import java.util.Scanner;
class Marriage 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter male age");
		int male_age=scan.nextInt();
	    System.out.println("enter female age");
		int female_age=scan.nextInt();
		if  (male_age>=23 && female_age>=21)
		{
			System.out.println("eligible for marriage");
		}
		else
		{
		System.out.println("not eligible for marriage");
		}
	}
}