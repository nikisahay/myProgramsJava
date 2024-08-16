package core;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("col1", 150);
		map.put("col2", 170);
		map.put("col3", 110);
		
		System.out.println("Initial Mappings are: " + map);
		System.out.println("The Value is: " + map.get("col1"));
	}

}
