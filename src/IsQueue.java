import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.Queue;
public class IsQueue {

	public static void main(String[] args) {
List<Integer> a1 = new LinkedList<>();
a1.add(100);
a1.add(200);
Queue<Integer> a2= new PriorityQueue<>();

a2.add(30);
//a2.offer(17);
a2.add(20);

System.out.println(a2);
a2.add(16);
System.out.println(a2);

Iterator<Integer> a3 = a2.iterator();
while(a3.hasNext())
{
System.out.print(a3.next());
System.out.print(",");
}
System.out.println();


a1.addAll(a2);
System.out.println(a1);
System.out.println(a1.get(3));
System.out.println("Does LinkedList contain 200? -- "+a1.contains(200));
System.out.println("Removed element is "+a1.remove(2));

a2.offer(500);
System.out.println(a2.element());
System.out.println("Peek of a2 is "+ a2.peek());
//System.out.println("Poll of a2 "+a2.poll());
a1.removeAll(a2);

System.out.println(a2);
System.out.println(a1);
	}

}
