import java.util.Scanner;
class Simpleinterest
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter to find simple interest");
		int p=scan.nextInt();
		int r=scan.nextInt();
		int t=scan.nextInt();
		double simpleinterest=(p*t*r)/100;
		System.out.println("find simple interest is:"+simpleinterest);

	}
}
