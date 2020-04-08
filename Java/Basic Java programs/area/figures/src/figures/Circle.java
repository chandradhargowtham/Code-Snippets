package figures;



public class Circle implements imply
{
	//FIELDS
	
	double a,b,c;
	
	
	//CONSTRUCTORS
	
	Circle(double a)
	{
		this.a=a;
		area();
		perimeter();
	}
	
	
	//METHODS
	public void area()
	{
		
		System.out.println("The Area of Circle is "+ pi*a*a);
	}
	
	
	public void perimeter()
	{
		System.out.println("The Perimeter of Circle is "+ (2*pi*a));
	}
	
	
	
}
