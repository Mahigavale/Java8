package core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CricketerManipulation {

	public static void main(String[] args) {

		
		ArrayList<Cricketer> Csk=new ArrayList<Cricketer>();
		
		Csk.add(new Cricketer(7,"Msd","Ranchi",23));
		Csk.add(new Cricketer(8,"MSS","patna",24));
		Csk.add(new Cricketer(9,"MSN","LAtur",26));
		Csk.add(new Cricketer(10,"MMM","Pune",34));
		Csk.add(new Cricketer(11,"MMS","Hyderabad",78));
		
		for(Cricketer c:Csk)
		{
			System.out.println(c.name);
			System.out.println(c.centuries);
			System.out.println("************************");
		}

		
		Csk.stream().forEach((n)->{
			if(n.centuries<25)
			{
				System.out.println("not a great player :"+ n.name);
			}
			else
			{
				System.out.println("great player :"+ n.name);
			}
		});
		
		System.out.println("using map :*********************");
		
		
		List<String> goodplayers=Csk.stream().map(demo::greatplayer).collect(Collectors.toList());
		
		
		for(String name :goodplayers)
		{
			System.out.println(name);
		}
	}

	static class demo{
		
		static public String greatplayer(Cricketer c)
		{
			if(c.centuries>30)
			{
				return c.name;
			}
			else
			{
				return "deleted_entry";
			}
		}
	}
}



