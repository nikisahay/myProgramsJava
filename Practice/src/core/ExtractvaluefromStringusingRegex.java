package core;

public class ExtractvaluefromStringusingRegex {

	public static void main(String[] args) {
//		String element2 = "{geb_dat=01.01.1990}";
//		String[] splitedValues = element2.toString().split("=");
//		System.out.println("value of split before" +splitedValues[0]);
//        String date = splitedValues[1].replace("}", "");
//        System.out.println("the date is " +date);

		String element2 = "[{_c0=1699308338177}]";
		String[] splitedValues = element2.toString().split("=");
		System.out.println("value of split before" +splitedValues[0]);
		String meta_timestamp = splitedValues[1].replace("}]", "");
		System.out.println("the timestamp is " +meta_timestamp);
	}

}
