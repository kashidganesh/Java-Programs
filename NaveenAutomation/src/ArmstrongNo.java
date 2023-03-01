
public class ArmstrongNo {

	public static boolean isArmstrong(int no) {

		int power = power(no);
		int temp = no;
		int sum = 0;

		while (temp != 0) {
			int lastDigit = temp % 10;
			int factor = 1;
			for (int i = 0; i < power; i++) {
				factor = factor * lastDigit;
			}
			sum = sum + factor;
			temp = temp / 10;
		}
		if (sum == no) {
			return true;
		} else {
			return false;
		}
	}

	public static int power(int num) {
		int n = 0;
		while (num != 0) {
			n++;
			num = num / 10;
		}
		return n;
	}

	public static void main(String[] args) {

		System.out.println(isArmstrong(1253));

	}

}
