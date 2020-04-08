package ds;

import java.util.Scanner;

public class Queue extends DS{
	
	int length=10;
	Integer arr[]=new Integer[length];
	
	
public void push(int x)
	{
	
	push:for(int i=0;i<length;i++)
	{
		if(arr[i]==null) 
		{
		arr[i]=x;
		return;
		}
	}
	
	}

public void pop()
	{
	for(int i=0;i<length;i++)
	{
		 if(i<(length-1))
		 {
		arr[i]=arr[i+1];
		
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
		
		
		Queue stack = new Queue();
		System.out.println("Push");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.show();
		System.out.println("Pop");
		stack.pop();
		stack.show();
		
		
	}



}