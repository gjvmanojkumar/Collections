package Collections;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
