
public class FindSubString {

	public static boolean isSubstring(String main, String sub) {
		return main.matches("(.*)" + sub + "(.*)");
	}

	public static boolean isSubstring1(String main, String sub) {
		return main.contains(sub);
	}

	public static void main(String[] args) {

		System.out.println(isSubstring("ganesh abasaheb kashid", "kashid"));
		System.out.println(isSubstring1("ganesh abasaheb kashid", "kashid"));

	}

}
