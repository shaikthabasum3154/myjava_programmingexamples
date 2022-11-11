import java.util.Scanner;
class Perfect_num 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the given number");
		int number=scan.nextInt();
		 int sum=0,i=1;
		 for (i=1;i<number;i++ )
		 {
          if (number%i==0)
			 {
			 sum=sum+i;
			 }
		 }
			if (sum==number)
			 {
				System.out.println("number is perfect");
			 }
			else
			 {
				System.out.println("is not a perfect number");
			 }
		 
	}
}
