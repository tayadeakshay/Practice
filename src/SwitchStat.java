import java.util.Scanner;
public class SwitchStat {

	public static void main(String[] args) {
		String yn;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number");
			long a =sc.nextInt();
			System.out.println("Enter second number");
			long b =sc.nextInt();
			long c=0;
			System.out.println("Enter operation to be performed +,-,*,/");
			String d =sc.next();
			switch(d) 
			{
				case "+" : c = a+b;
				break;
				case "-" : c = a-b;
				break;
				case "*" : c = a*b;
				break;
				case "/" : c = a/b;
				break;
				default :
					System.out.println("Invalid operation");
			}
			System.out.println("The ans is "+c);
				System.out.println("If you want to continue then press Y else N");
				yn = sc.next();
	
		
		}while((yn.equals("y"))||(yn.equals("Y")));
		
			}

}
