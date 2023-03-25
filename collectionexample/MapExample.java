package collectionexample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
  public static void main(String args[])
  {
//	  HashMap<String,String> hm = new HashMap<String, String>();
//	  TreeMap<String,String> hm = new TreeMap<String, String>();
//	  LinkedHashMap<String,String> hm = new LinkedHashMap<String, String>();
//	  Hashtable<String,String> hm = new Hashtable<String, String>();
	  Map<String,String> hm = new Hashtable<String, String>();
	  hm.put("rno", "1001");
	  hm.put("sname","xyz");
	  hm.put("branch","cs");
	  hm.put("fees","15000");
	  Set<Map.Entry<String,String>> mp= hm.entrySet();
	  for(Map.Entry<String,String> me:mp)
	  {
		  System.out.println(me.getKey() + "," + me.getValue());
	  }
	  
	  
  }
}
