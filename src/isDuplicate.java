import java.util.Arrays;
import java.util.*;

public class isDuplicate {

	static int[] a = { 1, 89, 65, 78, 578, 3, 67, 3468, 34, 89, 65, 78, 3 };
	static int[] b = new int[a.length];
	static int index = 0;
	static int[] c;

	public static void main(String[] args) {

		Arrays.sort(a);
		System.out.println(Arrays.toString(removeDuplicate(a)));
	}

	public static int[] removeDuplicate(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[index++] = a[i];
			}
		}

		b[index++] = a[a.length - 1];
		c = Arrays.copyOf(b, index);

		return c;
	}

}
