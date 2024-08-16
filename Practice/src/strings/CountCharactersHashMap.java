package strings;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "beginners";
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		char strArray[]= name.toCharArray();
		for(char c: strArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			
			}
		}	
      System.out.println(name + ":" + charMap);
	}

}
