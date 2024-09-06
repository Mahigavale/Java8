package miscellenious;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		
		
		Random otp=new Random();
		
		int otp2=otp.nextInt(1000);
		
		System.out.println(otp2);
		
		ArrayList<Employee> Mindtree=new ArrayList<Employee>();
		
		System.out.println("please enter the otp:");
		int otp3=scan.nextInt();
		
		
		if(otp3==otp2)
		{
			System.out.println("please enter the employee details :id , Name:");
			
			int id=scan.nextInt();
			String name=scan.next();
			Mindtree.add(new Employee(id,name));
		}
		
		else
		{
			System.out.println("wrong otp:");
		}
		
		
		for(Employee e:Mindtree)
		{
			System.out.println(e.id);
			System.out.println(e.name);
		}
	}

}

class Employee
{
	int id;
	String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
}