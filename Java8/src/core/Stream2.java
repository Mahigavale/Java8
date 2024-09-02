package core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> person=new ArrayList<String>();
		
		person.add("mane");
		person.add("sunil");
		person.add("ashok");
		
		
		person.stream().forEach((n)->{System.out.println(n.toUpperCase());});
		//seperate
		
		
		System.out.println("the method from Demo:");
		List<String> person_converted=person.stream().map(Demo::demo).collect(Collectors.toList());
		
		
		for(String name:person_converted)
		{
			System.out.println(name);
		}
		
		
	}
	 static class Demo
	 {
	 	
	 	public static String demo(String str)
	 	{
	 		return str.toUpperCase();
	 	}
	 }

}

