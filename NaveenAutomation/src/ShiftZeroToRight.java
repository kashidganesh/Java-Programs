import java.util.Arrays;

public class ShiftZeroToRight {

	public static int[] shiftZeroToRight(int[] A) {

		int newArray[] = new int[A.length];
		int count = 0;
		for (int no : A) {
			if (no != 0) {
				newArray[count] = no;
				count++;
			}

		}

		return newArray;
	}

	public static void main(String[] args) {

		int[] i = new int[] { 1, 0, 0, 5, 0, 0, 8, 0 };
		System.out.println(Arrays.toString(shiftZeroToRight(i)));

	}

}
