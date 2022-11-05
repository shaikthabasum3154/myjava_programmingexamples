import java.util.Scanner;
class Area_volume
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("================================");
		System.out.println("       welcome to");
		System.out.println("      Area and volume calculator");
		System.out.println("================================");
        System.out.println("enter 1 to find area");
		System.out.println("enter 2 to find volume");
        System.out.println("enter your choice");
		int c=scan.nextInt();
		if (c==1)
		{
		
		System.out.println("      "+(char)3+" enter 1 to find circle area");
		System.out.println("      "+(char)4+" enter 2 to find triangle area");
		System.out.println("      "+(char)4+" enter 3 to find square area ");
		System.out.println("      "+(char)4+" enter 4 to find rectangle area");
		System.out.println("      "+(char)4+"enter 5 to find rhombus area");
	    System.out.println("      "+(char)4+"enter 6 to find pentagon area");
	    System.out.println("      "+(char)4+"enter 7 to find trapezium area");
		System.out.println("      "+(char)4+"enter 8 to find parallelogram area");
        System.out.println("================================");
		if (choice==1)
		 {
			System.out.println("you have choosen circle to find its area");
			System.out.println("enter radius of circle");
			double r=scan.nextDouble();
			double area1=3.14*r*r;
			System.out.println("Area of circle is :"+area1);
		 }
		 else if (choice==2)
		 {
			 System.out.println("you have choosen triangle to find its area");
			 System.out.println("enter the breadth of traingle");
			 System.out.println("enter the lenght of a triangle");
			 double l=scan.nextDouble();
			 double b=scan.nextDouble();
			 double area2=0.5*l*b;
			 System.out.println("area of triangle is:"+area2);
		 }
		 else if (choice==3)
		{
			 System.out.println("enter the area of square");
			 System.out.println("enter the side of a square");
			 int s=scan.nextInt();
			 int area3=s*s;
			 System.out.println("area of a square is:"+area3);
		}
		else if (choice==4)
		{
			System.out.println("enter the area of reactangle");
			System.out.println("enter the lenght of a reactangle");
			System.out.println("enter the width of a reactangle");
			int l=scan.nextInt();
			int w=scan.nextInt();
            double area4=l*w;
			System.out.println("area of a rectangle is:"+area4);
		}
		else if (choice==5)
		{
			System.out.println("enter the area of a rhombus");
			System.out.println("enter the diagonal of a rhombus");
			System.out.println("enter the diagonal of a rhombus");
			int d1=scan.nextInt();
			int d2=scan.nextInt();
			double area5=(d1*d2)/2;
			System.out.println("area of a rhombus is :"+area5);
		}
		else if (choice==6)
		{
			System.out.println("enter the area of pentagon");
		    System.out.println("enter the side of a pentagon");
			int s=scan.nextInt();
			int area6=s;
			System.out.println("area of a pentagon is:"+area6);
	    }
	    else if (choice==7)
	    {
		System.out.println("enter the area of a trapezium");
		System.out.println("enter the base of a trapezium");
		System.out.println("enter the base of a trapezium");
		System.out.println("enter the height of a trapezium");
		int b1=scan.nextInt();
		int b2=scan.nextInt();
		int h=scan.nextInt();
		double area7=((b1+b2)*h)/2;
		System.out.println("area of a trapezium is:"+area7);
	    }
		else if (choice==8)
		{
			System.out.println("enter the area of a pareallelogram");
			System.out.println("enter the base of a parallelogram");
			System.out.println("enter the height of a parallelogram");
			int b1=scan.nextInt();
			int h1=scan.nextInt();
			int area8=b1*h1;
			System.out.println("area of a paralellogram is:"+area8);
		}
		System.out.println("thank  you...!!!get lost....");

	}
    else if (choice2==2)
	{
	System.out.println("========================");
	System.out.println("           welcome to");
	System.out.println("     volume of a calculator");
	System.out.println("==============================");
	System.out.println("enter the volume of a cube");
	System.out.println("enter the edge of a cube");
	int a1=scan.nextInt();
	int volume1=


	



	
	

