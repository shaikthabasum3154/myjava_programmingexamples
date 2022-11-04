import java.util.Scanner;
class Circle 
{
	public static void main(String[]args) 
	{
	Scanner scan=new Scanner(System.in);
		System.out.println("enter area of a circle");
		double r=scan.nextDouble();
		double area=3.14*r*r;
		System.out.println("area of circle is:"+area);
	}
}
