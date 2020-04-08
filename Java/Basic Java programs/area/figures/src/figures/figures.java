package figures;

import java.util.*;


public class figures {

	public static Scanner input=new Scanner(System.in);
	
	public static void main(String... a) 
	{
		
		System.out.println("Enter Choice: \n 1 for Square \n 2 for Rectangle \n 3 for Triangle \n 4 for Circle");
		
		
		try
		{
		int i=input.nextInt();
		
		if(i==1)
			{
				Square();
			}
		if(i==2)
			{
				Rectangle();
			}
		if(i==3)
			{
				Triangle();
			}
		if(i==4)
			{
				Circle();
			}
		if(i>4 || i<1)
		{
			System.out.print("Invalid input. End of Program. ");
			System.exit(0);
		}
		}
		catch(InputMismatchException e)
			{
			System.out.print("Invalid input. End of Program. ");
			System.exit(0);
			}
	}
	static void Square()
	{
		System.out.print("Enter side length: ");

			try
			{
				double d=input.nextDouble();
				new Square(d);	
			}
			catch(InputMismatchException e)
			{
				System.out.print("Invalid input. End of Program. ");
				System.exit(0);
			}
	}
	static void Circle()
	{
		System.out.print("Enter Radius: ");

			try
			{
				double d=input.nextDouble();
				new Circle(d);	
			}
			catch(InputMismatchException e)
			{
				System.out.print("Invalid input. End of Program. ");
				System.exit(0);
			}
	}
	static void Rectangle()
	{
		

			try
			{
				System.out.print("Enter length: ");
				double l=input.nextDouble();
				System.out.print("Enter Breadth: ");
				double b=input.nextDouble();
				new Rectangle(l,b);	
			}
			catch(InputMismatchException e)
			{
				System.out.print("Invalid input. End of Program. ");
				System.exit(0);
			}
		
	}
	static void Triangle()
	{
		

			try
			{
				System.out.print("Enter Side 1: ");
				double a=input.nextDouble();
				System.out.print("Enter Side 2: ");
				double b=input.nextDouble();
				System.out.print("Enter Side 3: ");
				double c=input.nextDouble();
				new Triangle(a,b,c);	
			}
			catch(InputMismatchException e)
			{
				System.out.print("Invalid input. End of Program. ");
				System.exit(0);
			}
		
	}
	
}
