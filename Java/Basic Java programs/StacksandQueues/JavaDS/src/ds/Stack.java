package ds;

import java.util.Scanner;

public class Stack extends DS{
	
	int length=10;
	Integer arr[]=new Integer[length];
	
	
public void push(int x)
	{
	
	push:for(int i=0;i<length;i++)
	{
		if(arr[i]==null) 
		{
		arr[i]=x;
		break push;
		}
	}
	
	}

public void pop()
	{
	for(int i=0;i<length;i++)
	{
		if(arr[i]==null) 
		{
		arr[i-1]=null;
		break;
		}
	}
	}

public void show()
	{
	int c=0;
	for(int i=0;i<length;i++)
		if(arr[i]!=null) 
		{
			System.out.println(arr[i]);
			c++;
		
		}
	System.out.println("Current Capacity "+c+"/"+length);		
	}

public static void main(String...i)
	{
		System.out.println("Stack Implementation");
		
		
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		
		stack.show();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.show();
		
		
	}



}