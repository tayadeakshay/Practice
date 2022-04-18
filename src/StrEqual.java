
public class StrEqual {

	public static void main(String[] args) 
	{
		
		String s1 =new String("Akshay");
		//s1 = "Akshay";
		
		String s2 = "Akshay";
		boolean x = s1==s2; //op1
		System.out.println("Is location same: "+x);
		
		boolean y = s1.equals(s2); //op2
		System.out.println("Is content same: "+y);

		
		String s3 =new String(s1);
		//s3 = "Akshay";

		boolean z = s1==s3; //op3
		System.out.println("Is location same: "+z);

		boolean z1 = s1.equals(s3); //op4
		System.out.println("Is content same: "+z1);
		
		String s4 = "Akshay";
		boolean x1 = s4==s2; //op1
		System.out.println("Is location same: "+x1);
		System.out.println(s4.equals(s2));
		
		s2 ="Bhumesh";
		s2 =s4;
		System.out.println(s2);
char[] c = new char[]{'a','b','c'};
System.out.println(c);

	}

}
