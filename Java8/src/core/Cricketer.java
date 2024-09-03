package core;

public class Cricketer {

	
	int id;
	String name;
	String state;
	int centuries;
	
	public Cricketer(int id,String name,String state,int centuries)
	{
		this.id=id;
		this.name=name;
		this.state=state;
		this.centuries=centuries;
	}
	
	public Cricketer()
	{
		System.out.println("please intialize the values :");
	}
}
