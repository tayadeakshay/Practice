import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
public class PrioQueue {

	public static void main(String[] args) {

		Queue<Integer> a1 = new PriorityQueue<>(new Comp());
		a1.offer(40);
		a1.offer(30);
		
		a1.offer(20);
		a1.offer(10);
System.out.println(a1);
	}

}
class Comp implements Comparator<Integer>
{
public int compare(Integer a,Integer b)
{
	int value = a.compareTo(b);
	if(value>0)
		return -1;
	else if(value <0)
		return 1;
	else
		return 0;		
}
}
