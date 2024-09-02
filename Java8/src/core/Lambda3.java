package core;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda3 {

	public static void main(String[] args) {

		
		
		 Student st=new Student();
		 st.setStudent_city(":Pune");
		 st.setStudent_id(12);
		 st.setStudent_name("Mahesh");
		 
		 Student st2=new Student();
		 st2.setStudent_city("Latur");
		 st2.setStudent_id(34);
		 st2.setStudent_name("priyanka");
		
		
		ArrayList<Student> Rgv=new ArrayList<Student>();
		
		Rgv.add(st2);
		Rgv.add(st);
		
		Consumer<Student> method=(Student)->{ System.out.println(Student.getStudent_name());
		System.out.println("*****************");};
		
		Rgv.forEach(method);
		
		
		
	}

}
