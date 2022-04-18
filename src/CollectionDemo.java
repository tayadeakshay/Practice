import java.util.ArrayList;
public class CollectionDemo {

	public static void main(String[] args) {
ArrayList a1 = new ArrayList();
a1.add(100);
a1.add(200);
a1.add("Akshay");


System.out.println(a1);
ArrayList a2 =new ArrayList();
a2.add("aaa");
a2.add("bbb");
a2.add("ccc");
a2.add("Akshay");
System.out.println(a2);

a2.addAll(a1);
System.out.println(a2);
System.out.println(a2.add("Bhumesh"));
System.out.println(a2.contains("Bhumesh"));
a2.remove("Bhumesh");
System.out.println(a2.contains("Bhumesh"));
a2.removeAll(a1);
System.out.println(a1);
System.out.println(a1.isEmpty());
System.out.println(a2);
//a1.clear();
System.out.println(a1.isEmpty());
	}

}
