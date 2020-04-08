package studentmanagementsystem;

public class student {
	public int pid=0;
	static int count=0;
	
	private String name;
	private int age;
	private long phone;
	private String email;
	private int roomno;
	private String dept;

	public student(String name,int age,long phone,String email,int roomno,String dept) 
	{
		count++;
		this.name=name;
		this.age=age;
		this.pid=count;
		this.phone=phone;
		this.email=email;
		this.roomno=Integer.valueOf(roomno); // same as int value. Will also work for String(if type is String)
		this.dept=dept;
		
	}
	//Setters
	public void setName(String newnm)
	{
		this.name=newnm;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setPhone(long phone)
	{
		this.phone=phone;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setRoomNo(int roomno)
	{
		this.roomno=roomno;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	
	//Getters
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return age;
	}
	public long getPhone()
	{
		return phone;
	}
	public String getEmail()
	{
		return email;
	}
	public int getRoomNo()
	{
		return roomno;
	}
	public String getDept()
	{
		return dept;
	}
	public int getPid()
	{
		return pid;
	}
	

}
