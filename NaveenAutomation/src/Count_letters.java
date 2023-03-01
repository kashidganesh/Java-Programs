import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Count_letters {
	public static Map<Character, Integer> countLett(String str) {

		Map<Character, Integer> lett = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (lett.containsKey(ch)) {
				lett.put(ch, lett.get(ch) + 1);
			} else {
				lett.put(ch, 1);
			}
		}

//		Set<Map.Entry<Character, Integer>> entrySet = lett.entrySet();
//		for (Map.Entry<Character, Integer> entry : entrySet) {
//			if (entry.getValue() > 1) {
//				System.out.println(entry.getKey() + ":" + entry.getValue());
//			}
//		}

		return lett;
	}

	public static void main(String[] args) {

		String Name = " ganesh abasaheb kashid ";
		Name = Name.replaceAll("\\s", "");
		// System.out.println(countLett(Name));

		Set<Map.Entry<Character, Integer>> entrySet = countLett(Name).entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}

	}

}
