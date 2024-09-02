package core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lamda2 {

	public static void main(String[] args) {

		
		Student one=new Student();
		one.setStudent_city("Pune");
		one.setStudent_id(-3);
		one.setStudent_name("Mahesh");
		
		Student two=new Student();
		two.setStudent_city("Latur");
		two.setStudent_id(13);
		two.setStudent_name("Mansi");
		
		Student three=new Student();
		three.setStudent_city("Omerga");
		three.setStudent_id(-45);
		three.setStudent_name("Parikshit");
		
		
		List<Student> Dscl=new ArrayList<Student>();
		
		Dscl.add(one);
		Dscl.add(two);
		Dscl.add(three);
		
		//int i=1;
		
		Dscl.forEach((n)->{
			if(n.getStudent_id()<0)
			{
				System.out.println("Wrong id for student "+n.getStudent_id());
				
			}
			else
			{
				//System.out.println(n.getStudent_id());
				System.out.print(n.getStudent_city()+" "+n.getStudent_id()+" "+n.getStudent_name());
				System.out.println();
			}
			
		});
		
		Consumer<Student> method1= (n)->{System.out.println(n);};
		Dscl.forEach(method1);
		
		Consumer<Student> method2=(n)->{
			if(n.getStudent_id()>15)
			{
				System.out.println("exceeded !");
			}
			else
			{
				System.out.println("not exceeded !");
			}
		};
		
		
		Dscl.forEach(method2);
	}

}
