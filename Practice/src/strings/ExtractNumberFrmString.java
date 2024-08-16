package strings;

public class ExtractNumberFrmString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ab12cd34";
		String replaceStr = str.replaceAll("[^a-z]", "");
        System.out.println("string without alphabets " +replaceStr);
	}

}
