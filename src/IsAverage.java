import java.util.Arrays;
public class IsAverage {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int sum =0;
		for(int b:a)
		{
			sum = sum + b;
		}
		System.out.println(sum);
System.out.println(sum/a.length);
System.out.println(Arrays.binarySearch(a, 3));
	}
}

