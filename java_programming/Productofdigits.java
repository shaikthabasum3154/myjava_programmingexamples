import java.util.Scanner;
class  Productofdigits 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int lastdigit=0;
         int product=1;
		while (num>0)
		{
			lastdigit=num%10;
			product=product*lastdigit;
			num=num/10;
		}
		System.out.println("product of the digits is:"+product);
	} 

}