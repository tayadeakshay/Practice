
public class AddArray {
	
static int sum,sum1 =0;
	public static void main(String[] args) {
	
		int[] a = {1,2,3,4,5,6};
		System.out.println("Sum of Even no is:-- "+addEven(a));
		
		System.out.println("Sum of Odd no is:-- "+addOdd(a));

	}
	public static int addEven(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 == 0)
			{
				sum = sum + a[i];
			}
		}
			return sum;	
	}
	public static int addOdd(int[] b)
	{
	for(int i=0;i<b.length;i++)
	{
		if(b[i]%2 != 0)
		{
			sum1 = sum1 + b[i];
		}
	}
		return sum1;		
}
}
