
public class PrintNoWithOutLoop {

	public static void PrintNo(int no) {
		if (no <= 100) {
			System.out.println(no);
			PrintNo(no + 1);
		}

	}

	public static void main(String[] args) {

		int i = 0;

		PrintNo(i);

	}

}
