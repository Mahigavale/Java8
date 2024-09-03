package core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

		
		
		List<String> names=new ArrayList<String>();
		names.add("Mahesh");
		names.add("Ashok");
		names.add("gavale");
		names.add("Latur");
		
		names.stream().forEach((n)->{System.out.println(n.toUpperCase());});
		
		
		List<String> answer=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println("using the map in java*************************");
		for(String nm:answer)
		{
			System.out.println(nm);
		}
		
		System.out.println("foreach :");
		for(String name:names)
		{
			System.out.println(name+" ");
		}
		
				
	}

}
 