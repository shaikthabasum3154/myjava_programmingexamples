import java.util.Scanner;
class Non_fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");            
	     int n=scan.nextInt();
	     int a=0;
		 int b=1;
		 int sum=0;
		 for (int i=1;b<=100;i++)
		 {
			 for (int j=b+1;j<sum&&j<=100;j++ )
			 {
			 System.out.println(j);
			 }
			 a=b;
			 b=sum;
			 sum=a+b;
		 }
	}
}