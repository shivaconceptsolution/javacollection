package collectionexample;

import java.util.ArrayList;
import java.util.Collections;

public class ListExampleNew {

	public static void main(String[] args) {
		ArrayList<Student> obj = new ArrayList<Student>();
		obj.add(new Student(1007,"xyz",55000));
		obj.add(new Student(1002,"mno",55000));
		obj.add(new Student(1003,"ravi",78000));
		Collections.sort(obj);
		for(Student s:obj)
		{
			System.out.println(s);
		}
		ArrayList<StudentNew> obj1 = new ArrayList<StudentNew>();
		obj1.add(new StudentNew(1007,"xyz",55000));
		obj1.add(new StudentNew(1002,"mno",55000));
		obj1.add(new StudentNew(1003,"ravi",78000));
		Collections.sort(obj1,new FeesComparator());
		for(StudentNew s:obj1)
		{
			System.out.println(s);
		}
	}

}
;