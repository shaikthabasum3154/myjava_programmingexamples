import java.util.Scanner;
class Percentage
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the total marks");
		int a=scan.nextInt();
		System.out.println("enter the obtained marks");
		int b=scan.nextInt();
		double percentage=(a%b)*100;
		System.out.println("the percentage "+a+"and"+b+"is:"+percentage);
	}
}
