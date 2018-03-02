package Collections;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<String, String> ht1 = new Hashtable();
		ht1.put("course1", "Selenium");
		ht1.put("course2", "Manual");
		//check
		Hashtable<String, String> ht2 = new Hashtable<String, String>();
		ht2.put("location1", "HYD");
		ht2.put("location2", "GNT");
		
		Hashtable<String, Hashtable<String, String>> ht = new Hashtable<String, Hashtable<String, String>>();
		ht.put("Job", ht1);
		ht.put("State",ht2);
		
		System.out.println(ht.get("Job").get("course1"));
		System.out.println(ht.get("State").get("location1"));
		}

	}
