
public class IsPalindrome {

	public static void main(String[] args) {
		int a = 3223;
		int temp = a;
		int rem;
		int res=0;
		while(a != 0)
		{
		rem = a%10;
		res = res*10+rem;
		a= a/10;
		}
		
		if(temp == res)
System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
	}

}
