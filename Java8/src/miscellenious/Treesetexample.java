package miscellenious;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treesetexample {

	public static void main(String[] args) {

		
		
		Set<Integer> s1=new TreeSet<Integer>();
		
		
		
		s1.add(23);
		s1.add(45);
		s1.add(67);
		s1.add(11);
		System.out.println(s1);
		
		//11+23+45+67=>146
		
		System.out.println(s1.hashCode());
		
		s1.add(34);
		s1.add(72);
		System.out.println(s1.hashCode());
		
		
		
		Iterator<Integer> itr=s1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
