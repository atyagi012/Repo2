package may_31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class SetEx {
	
	@Test
	public void atTest(){
		//Set Dec
		
		//List<String> myL = new ArrayList<String>();
		
		Set<String> mySet = new HashSet<String>();
		
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		mySet.add("C");
		mySet.add("D");
		mySet.add("T");
		mySet.add("Y");
		mySet.add("S");
		
		//System.out.println(mySet.get); //Point
		System.out.println(mySet.size());
		System.out.println(mySet);
		
		//HashMap and HashTable
	}

}
