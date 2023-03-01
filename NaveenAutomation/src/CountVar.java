
public class CountVar {

	public static int find(String str, char f) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (temp == f) {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {

		String str = "ganeaashs";
		char f = 's';
		// find(str, f);
		System.out.println(find(str, f));

	}

}
