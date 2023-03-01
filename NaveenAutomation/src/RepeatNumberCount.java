import java.util.HashMap;
import java.util.Set;

public class RepeatNumberCount {

	public static void getDigitCount(long number) {

		HashMap<Long, Integer> digitMap = new HashMap<>();
		while (number != 0) {
			long lastDidit = number % 10;

			if (digitMap.containsKey(lastDidit)) {
				digitMap.put(lastDidit, digitMap.get(lastDidit) + 1);
			} else {
				digitMap.put(lastDidit, +1);
			}

			number = number / 10;
		}

		Set<Long> keys = digitMap.keySet();
		for (Long key : keys) {
			System.out.println(" " + key + " : " + digitMap.get(key));
		}

	}

	public static void main(String[] args) {
		getDigitCount(121);
	}

}
