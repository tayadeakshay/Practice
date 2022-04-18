
public interface IsInterface {
public void getType();
public void getVersion();
public static void main(String[] args)
{
System.out.println("Hello");
Akshay a = new Akshay();
a.getType();
a.getVersion();
}
}
class Akshay implements IsInterface
{
public void getType()
{
	System.out.println("getType");
}
public void getVersion()
{
System.out.println("getVersion");	
}
	}