package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] words = {"funky","furry","chunk","bacanator"};
//		
//		for(String w: words)
//			if(w.startsWith("fu"))
//				System.out.println(w + " starts with fu");
//System.out.println(words.length);
Basics1.isValid("2001-44-88");

	}

public static boolean isValid(String text) {
    if (text == null || !text.matches("\\d{4}-[01]\\d-[0-3]\\d"))
        return false;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    df.setLenient(false);
    try {
        df.parse(text);
        return true;
    } catch (ParseException ex) {
        return false;
    }
  }
}
