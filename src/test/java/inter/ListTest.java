package inter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class ListTest {
	List<String> aList = new ArrayList<String>();
	List<String> iList =  new LinkedList<String>();
	@Test
	public void t1() {
		aList.add("amar");
		iList.add("sinika");
		
	}

}
