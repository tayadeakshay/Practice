import java.util.Iterator;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseIterator {

	public static void main(String[] args) {
ArrayDeque<String> a1 = new ArrayDeque<>();
a1.add("Akshay");
a1.add("Ajinkya");
a1.add("Bhumesh");
a1.add("Swapnil");

ArrayDeque<Integer> a2= new ArrayDeque<>();
a2.add(20);
a2.add(10);
a2.add(40);
a2.add(30);

Iterator<String> i1 = a1.iterator();
while(i1.hasNext())
{
System.out.print(i1.next());
System.out.print(",");
}
System.out.println();

Iterator<String> i2 =a1.descendingIterator();
while(i2.hasNext())
{
System.out.print(i2.next() + ",");

}
System.out.println();
System.out.println(a1.size());

//int[] i = new int[4];
Object[] array = a2.toArray();
Iterator i3 = a2.descendingIterator();

//for(Object d:array)
//{
	while(i3.hasNext())
	{
	System.out.print(i3.next()+" ");
	//System.out.print(d+" ");
	}
	System.out.println();
//}
a2.toArray();
//System.out.println(a2.toArray());

System.out.println(a2.poll());
}

	}


