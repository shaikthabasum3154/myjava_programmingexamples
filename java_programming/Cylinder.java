import java.util.Scanner;
class  Cylinder
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter volume of cylinder");
		double r=scan.nextDouble();
		int h=scan.nextInt();
		double volume=3.14*r*r*h;
		System.out.println("volume of cylinder is:"+volume);

	}
}
