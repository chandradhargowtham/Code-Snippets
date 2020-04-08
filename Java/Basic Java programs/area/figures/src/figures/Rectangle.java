package figures;

public class Rectangle implements imply
{
	//FIELDS
	
	double l,b;
	
	
	//CONSTRUCTORS
	
	Rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
		area();
		perimeter();
	}
	
	
	//METHODS
	public void area()
	{
		System.out.println("The Area of Rectangle is "+ l*b);
	}
	
	
	public void perimeter()
	{
		System.out.println("The Perimeter of Rectangle is "+ 2*(l+b));
	}
	
	
	
}
