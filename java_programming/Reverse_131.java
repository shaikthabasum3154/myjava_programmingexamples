import java.util.Scanner;
class Reverse_131 
{
	public static void main(String[] args) 
	{
		int r;  
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		
		while (num>0)
		{ 
			r= num%10;
			
			r= num/10;
			System.out.println(r);
		}
	}
}
