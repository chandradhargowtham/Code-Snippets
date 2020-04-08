package calculator;
import java.util.*;

public class calculator {

	public static void main(String[] args) {
		System.out.println("Simple Calculator");
		System.out.println("*****************");
		System.out.println("Enter the first value:");
		Scanner input = new Scanner(System.in);
		double x= input.nextDouble();
		System.out.println("Enter the second value:");
		double y= input.nextDouble();
		System.out.println("Please select an operation: ");
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		System.out.println("Press 5 for Power");
		int z=input.nextInt();
	
		if(z==1) {
			System.out.println("Addition of "+ x + " and "+ y+ " is "+ (x+y) );
			
		}
		else if(z==2) {
			System.out.println("Subtraction of "+ x + " and "+ y+ " is "+ (x-y) );
			
		}
		else if(z==3) {
			System.out.println("Multiplication of "+ x + " and "+ y+ " is "+ (x*y) );
			
		}
		else if(z==4 && x>0 && y>0) {
			System.out.println("Division of "+ x + " and "+ y+ " is "+ (x/y) );
			
		}else if(z==5) {
			System.out.println( x + "^"+ y+ " is "+ (Math.pow(x, y)) );
			
		}
		else System.out.println("Invalid Input");
		input.close();
			

	}

}
