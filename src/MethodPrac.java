
public class MethodPrac {
public static int addition(int a,int b)
{

	System.out.println("Addition Started");	
int sum = a+b;
System.out.println(substraction(40,30));
System.out.println("Addition ended");
	return sum;
}
//=============================================
public static int substraction(int a,int b)
{
	System.out.println("Substraction Started");	
int sum = a-b;
System.out.println("Substraction ended");
	return sum;

	}
//==============================================
public static void main(String[] args)
{
System.out.println("Main started");
System.out.println(addition(20,30));
//System.out.println(addition(20,30)-substraction(40,30));
System.out.println(substraction(40,30));
System.out.println("Main ended");
}
}
