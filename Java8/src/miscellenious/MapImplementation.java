package miscellenious;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapImplementation {

	public static void main(String[] args) {

		
		
		Map<String,Long> Person=new HashMap<String,Long>();
		
		Person.put("Mahesh",(long) 637387383);
		Person.put("Mansi", (long)7878678);
		
		
		for(Map.Entry<String,Long> e:Person.entrySet())
		{
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	
		
		
		for(String str:Person.keySet())
		{
			System.out.println(str);
		}
		
		for(long l:Person.values())
		{
			System.out.println(l);
		}
		
		Iterator<Map.Entry<String,Long>> itr=Person.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String,Long> mp=itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
	}

}
