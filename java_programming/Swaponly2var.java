import java.util.Scanner;
class Swaponly2var  
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x value is:"+x);
		System.out.println("y value is:"+y);
	}
}
