import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class NewArrayList {

	public static void main(String[] args) {
List<Integer> a1 = new ArrayList<>();
List<Integer> a2 = new ArrayList<>();

a1.add(100);
a1.add(200);
a1.add(30);

a2.add(50);
a2.add(60);
a2.add(900);

System.out.println(a1.get(0));
System.out.println(a1);
System.out.println(a1.remove(1));
System.out.println(a1);
System.out.println(a1);
System.out.println(a1.addAll(a2));
System.out.println(a1);
System.out.println(a2);
a1.add(5,200);
System.out.println(a1);
a1.sort(Comparator.reverseOrder());
System.out.println(a1);
	}

}
