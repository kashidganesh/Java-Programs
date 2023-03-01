
public class Vowel {

	public static boolean isVowel(char s) {
		return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O'
				|| s == 'U';

	}

	public static void main(String[] args) {

		String str = "gANESHa";
		int VCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				VCount++;
			}
		}
		System.out.println(VCount);

	}

}
