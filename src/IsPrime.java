
public class IsPrime {

	public static void main(String[] args) {
		int a = 817;
		int temp=0;
		if(a==0||a==1)
			System.out.println(a+" is not a prime number");
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
			{
				System.out.println(a+ " is not a prime no");
				temp=temp+1;
			break;
			}
		}
		if(temp == 0)
			System.out.println(a+" is a prime no");

	}

}
