package figures;

public class Square implements imply
{
	//FIELDS
	
	double d;
	
	
	//CONSTRUCTORS
	
	Square(double d)
	{
		this.d=d;
		area();
		perimeter();
	}
	
	
	//METHODS
	public void area()
	{
		System.out.println("The Area of Square is "+ d*d);
	}
	
	
	public void perimeter()
	{
		System.out.println("The Perimeter of Square is "+ 4*d);
	}
	
	
	
}
