import java.util.Scanner;
class Swap_num 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println(x);
		System.out.println(y);
		int z=x;
		x=y;
		y=z;
		System.out.println(z);
	}
}
