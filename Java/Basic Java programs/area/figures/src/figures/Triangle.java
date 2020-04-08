package figures;



public class Triangle implements imply
{
	//FIELDS
	
	double a,b,c;
	
	
	//CONSTRUCTORS
	
	Triangle(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		area();
		perimeter();
	}
	
	
	//METHODS
	public void area()
	{
		double p=Math.ceil((a+b+c)/2);
		double x=Math.sqrt(Math.ceil((p*(p-a)*(p-b)*(p-c))));
				if(x==0)
				{
					System.out.println("Invalid Triangle. End of Program" );
					System.exit(0);
				}
				else
					System.out.println("The Area of Triangle is "+a );
	}
	
	
	public void perimeter()
	{
		System.out.println("The Perimeter of Triangle is "+ (a+b+c));
	}
	
	
	
}
