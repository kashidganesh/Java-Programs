
public class AvgArray {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,1 };

		int total = 0;

		for (int i : num) {
			total = total + i;

		}

		System.out.println(total / num.length);
	}

}
