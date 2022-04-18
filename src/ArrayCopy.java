
public class ArrayCopy {

	public static void main(String[] args) {

		int[] numbers = { 10, 25, 30, 45, 50, 60 };

		for (int num : copyArray(numbers)) {
			System.out.print(num + " ");
		}
		System.out.println();
		for (int even : filterEvenNo(numbers)) {
			System.out.print(even + " ");
		}
	}

	public static int[] copyArray(int[] a) {
		int startIndex = a.length / 2;
		int endIndex = a.length - 1;
		int length = a.length / 2;

		int[] newArray = new int[length];
		int index = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			newArray[index] = a[i];
			index++;
		}
		return newArray;
	}

	public static int[] filterEvenNo(int[] b) {
		int index = 0;
		int countEvenNo = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0)
				countEvenNo++;
		}
		System.out.println(countEvenNo);

		int[] evenArray = new int[countEvenNo];
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0)
				evenArray[index++] = b[i];

		}
		return evenArray;
	}

}
