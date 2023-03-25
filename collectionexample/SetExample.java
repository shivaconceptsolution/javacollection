package collectionexample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
	//	HashSet<String> obj = new HashSet<String>();
	//	LinkedHashSet<String> obj = new LinkedHashSet<String>();
	//	TreeSet<String> obj = new TreeSet<String>();
		Set<String> obj = new TreeSet<String>();
		obj.add("C");
		obj.add("CPP");
		obj.add("JAVA");
		obj.add("PHP");
		obj.add("AHP");
		obj.add("IOS");
		for(Object o:obj)
		{
			System.out.println(o);
		}

	}

}
