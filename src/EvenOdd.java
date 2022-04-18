import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no till which addition of Even and Odd no's is required");
		int x = sc.nextInt();
		
		int sumEven=0,sumOdd=0;
		for(int i=1;i<=x;i++)
		{
			if(i%2==0)
			sumEven = sumEven +i;
			else
				sumOdd =sumOdd +i;
		}
		System.out.println("Sum of Even no till "+x+" is -- " + sumEven);
		System.out.println("Sum of Odd no till "+x+" is -- "+ sumOdd);

	}

}
