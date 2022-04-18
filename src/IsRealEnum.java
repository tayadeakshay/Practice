import java.util.EnumSet;
enum IsEnumSet {

	JAN,MAR,APR,MAY,JUN,JUL,AUG,FEB
}
public class IsRealEnum
{
	public static void main(String[] args)
	{
IsEnumSet[] b =IsEnumSet.values();
for(IsEnumSet c:b)
{
System.out.print(c +" ");	
}
System.out.println();
EnumSet<IsEnumSet> a1 = EnumSet.allOf(IsEnumSet.class);
System.out.println(a1);
}
}
