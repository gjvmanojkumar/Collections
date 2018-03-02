package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class testSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		Iterator<Integer> itrate = set.iterator();
		while(itrate.hasNext()) {
			System.out.println(itrate.next());
		}
	}

}
