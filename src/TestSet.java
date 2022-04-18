import java.util.Set;
import java.util.HashSet;

public class TestSet {

	public static void main(String[] args) {
		Set<Integer> a1 = new HashSet<>();
		a1.add(300);
		a1.add(100);
		a1.add(400);
		
		System.out.println(a1);
		System.out.println(a1.hashCode());
		System.out.println("----------------------");
		
		Set<Integer> a2 = new HashSet<>();
		a2.add(30);
		a2.add(50);
		a2.add(100);
		
		System.out.println(a2);
		
		a1.addAll(a2);
		System.out.println(a1);
		
System.out.println("--------------------");

a1.removeAll(a2);
System.out.println(a1);
	}

}
