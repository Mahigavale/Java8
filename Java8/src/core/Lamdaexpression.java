package core;

import java.util.ArrayList;
import java.util.List;

public class Lamdaexpression {

	public static void main(String[] args) {
	
		
		List<Integer> numbers=new ArrayList<Integer>();
		
		//int[] num2= {12,34,56};
		
		numbers.add(120);
		numbers.add(240);
		numbers.add(360);
		
		for(int i:numbers)
		{
			System.out.println(i);
		}
		System.out.println("*******************************");
		
		numbers.forEach((n)->{System.out.println(n+1);});
				
		numbers.forEach((n)->{
			
			if(n==120)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		});	
	}

}
