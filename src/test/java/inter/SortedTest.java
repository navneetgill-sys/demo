package inter;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SortedTest {
	
	
	Set<String> cities = new TreeSet<String>();
	@Test
	public void t1() {
		
	
	cities.add("livermore");
	cities.add("fremont");
	cities.add("sacramento");
	cities.add("edmonton");
	cities.add("1edmonton");
	cities.add("");
	cities.add("Edmonton");
	 for(String allcities : cities) {
		System.out.println(allcities);
	 }
		 
	 }
	

}
