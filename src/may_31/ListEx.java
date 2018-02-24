package may_31;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListEx {
	
	@Test
	public void atTest(){
		//List Dec
		
		List<String> myL = new ArrayList<String>();
		
		myL.add("A");
		myL.add("B");
		myL.add("C");
		myL.add("C");
		myL.add("D");
		myL.add("T");
		myL.add("Y");
		myL.add("S");
		
		System.out.println(myL.get(3));
		System.out.println(myL.size());
		System.out.println(myL);
	}

}
