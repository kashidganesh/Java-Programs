import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayJoins {

	public static void main(String[] args) {

		String str1[] = { "A", "E", "I" };
		String str2[] = { "O", "U" };

		List list = new ArrayList<>(Arrays.asList(str1));
		list.addAll(Arrays.asList(str2));

		Object[] str3 = list.toArray();
		System.out.println(Arrays.toString(str3));
	}

}
