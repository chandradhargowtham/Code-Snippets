package studentmanagementsystem;

import java.util.*;


public class mains{
	
	ArrayList<student> students= new ArrayList<student>();
	Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Welcome to Student Management Portal");
		new mains().menu();
		
		//input.close();
		
	}
	public  void menu() 
	{
		
		
		System.out.println("*****************************");
		System.out.println("press 1 to add new student");
		System.out.println("press 2 to view all students");
		System.out.println("press 3 to update students");
		System.out.println("press 4 to delete students");
		System.out.println("press 5 to search students");
		System.out.println("*****************************");
		
		
		int choice=input.nextInt();
		
		if(choice==1) 
		{
				add();
		}else if(choice==2)
		{
				view();
		}else if(choice==3)
		{
				update();
		}else if(choice==4)
		{
				delete();
		}
		else if(choice==5){
			System.out.println("Search students");
			search();
		}
		else{
				System.out.println("Invalid Choice. Try Again");
				menu();
			}
		}
	void add()
	{
		boolean valid=false;
		while(!valid) {
	try {
		
		System.out.println("Add new student");
		System.out.println("***************");
		System.out.println("Enter Name: ");
		String name=input.next();
		System.out.println("Enter Age: ");
		int course= input.nextInt();
		System.out.println("Enter Phone Number: ");
		long phone=input.nextLong();
		System.out.println("Enter Email id: ");
		String email=input.next();
		System.out.println("Enter Department: ");
		String dept=input.next();
		System.out.println("Enter Room Number: ");
		int roomno=input.nextInt();
		student s = new student(name,course,phone,email,roomno,dept);
		students.add(s);
		System.out.println("Successfully added. returning to the main menu");
		menu();
		valid=true;
	}catch(InputMismatchException e) 
		{
		System.out.println("Input Error. Try again");
		
		}
	}
	
	}
	void view()
	{
		System.out.println("View all students");
		for(student k:students)
		{
			System.out.print(" pid: "+k.getPid()); 
			System.out.print(" Name: "+k.getName());
			System.out.print(" age: "+k.getAge());
			System.out.print(" Phone: "+k.getPhone());
			System.out.print(" Email id: "+k.getEmail());
			System.out.print(" Room number: "+k.getRoomNo());
			System.out.print(" Department: "+k.getDept());
			System.out.print("\n");
			System.out.println("-----------------------------------------------------------------------------------");
		}
		System.out.println("Total Entries : "+students.size());
		System.out.println("Successfully retrieved all entries. Press 0 and Enter for main menu");
		int b= input.nextInt();
		if(b==0)
			menu();
		else
			System.out.println("Invalid Choice. Try Again");
	}
	void update() 
	{
		System.out.println("Enter current name: ");
		String nm=input.next();
		System.out.println("Enter updated name: ");
		String newnm=input.next();
		System.out.println("Enter updated age: ");
		int age=input.nextInt();
		System.out.println("Enter updated phone: ");
		long phone=input.nextLong();
		System.out.println("Enter updated email: ");
		String email=input.next();
		System.out.println("Enter updated roomno: ");
		int roomno=input.nextInt();
		System.out.println("Enter updated department: ");
		String dept=input.next();
		for(student k:students) 
		{
			if(k.getName().equals(nm))
			{
				students.get(k.pid-1).setName(newnm);
				students.get(k.pid-1).setAge(age);
				students.get(k.pid-1).setPhone(phone);
				students.get(k.pid-1).setEmail(email);
				students.get(k.pid-1).setRoomNo(roomno);
				students.get(k.pid-1).setDept(dept);
				menu();
			}
		}
	}
	void delete()
	{
		System.out.println("Enter name: ");
		String nm=input.next();
		for(student k:students) 
		{
			if(k.getName().equals(nm))
			{
				students.remove(k.pid-1);
				menu();
			}
		}
	}
	void search()
	{
		System.out.println(" Press 1 for search by name \n Press 2 for search by age \n Press 3 for search by department: ");
		try 
		{
		int a=input.nextInt();
		
		if(a==1) 
		{
			System.out.println("Enter Name: ");
			String nm=input.next();
			
			
			for(student k:students) 
			{
				

				if((k.getName()).equalsIgnoreCase(nm))
				//if((k.getAge())==nm)
				{

					System.out.print(" pid: "+k.getPid()); 
					System.out.print(" Name: "+k.getName());
					System.out.print(" age: "+k.getAge());
					System.out.print(" Phone: "+k.getPhone());
					System.out.print(" Email id: "+k.getEmail());
					System.out.print(" Room number: "+k.getRoomNo());
					System.out.print(" Department: "+k.getDept());
					System.out.print("\n");
					System.out.println("-----------------------------------------------------------------------------------");
					
					
				}
				
				
				}
			System.out.println("Search Finished");
			System.out.println("Press any input and Enter to return to main menu.");

			input.next();
			menu();
			
		}else if(a==2) 
		{
			System.out.println("Enter age: ");
			int nm=input.nextInt();
			
			
			for(student k:students) 
			{
				

				//if((k.getName()).equals(nm))
				if((k.getAge())==nm)
				{

					System.out.print(" pid: "+k.getPid()); 
					System.out.print(" Name: "+k.getName());
					System.out.print(" age: "+k.getAge());
					System.out.print(" Phone: "+k.getPhone());
					System.out.print(" Email id: "+k.getEmail());
					System.out.print(" Room number: "+k.getRoomNo());
					System.out.print(" Department: "+k.getDept());
					System.out.print("\n");
					System.out.println("-----------------------------------------------------------------------------------");
					
					
				}
				
				
				}
			System.out.println("Search Finished");
			System.out.println("Press any input and Enter to return to main menu.");

			input.next();
			menu();
			
		}else if(a==3) 
		{
			System.out.println("Enter Dept: ");
			String nm=input.next();
			
			
			for(student k:students) 
			{
				

				if((k.getDept()).equalsIgnoreCase(nm))
				//if((k.getAge())==nm)
				{

					System.out.print(" pid: "+k.getPid()); 
					System.out.print(" Name: "+k.getName());
					System.out.print(" age: "+k.getAge());
					System.out.print(" Phone: "+k.getPhone());
					System.out.print(" Email id: "+k.getEmail());
					System.out.print(" Room number: "+k.getRoomNo());
					System.out.print(" Department: "+k.getDept());
					System.out.print("\n");
					System.out.println("-----------------------------------------------------------------------------------");
					
					
				}
				
				
				}
			System.out.println("Search Finished");
			System.out.println("Press any input and Enter to return to main menu.");

			input.next();
			menu();
			
		}else 
			{
			System.out.println("Invalid Input. Returning to Menu");
			menu();
			}
		}catch(InputMismatchException e) 
		{
			System.out.println("Invalid Input. Program Ends");

		}
		
			
	}
	
	
		
	}
	
	

