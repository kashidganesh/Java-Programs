import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {

		String infra[] = { "BB", "AB", "AA", "AA", "YT", "BB", "CS" };

		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}

			}
		}
		System.out.println("*******************************");
		Set<String> data = new HashSet<String>();
		for (String e : infra) {
			if (data.add(e) == false) {
				System.out.println(e);
			}
		}

	}

}
