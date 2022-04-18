
public class AllTest{

	public static void main(String[] args) {
		System.out.println("Hello");
		for(int i=0;i<=10;i++)
		{
		Multi t1=new Multi();
		t1.start();
		}
		//Multi1 t2=new Multi1();
//		t2.start();
//		t2.yield();
//		
		
		
	}

}
class Multi extends Thread
{
public void run()
{
//for(int i=0;i<=10;i++)
System.out.println("Thread " + Thread.currentThread().getId()
        + " is running");
}
}
class Multi1 extends Thread
{
public void run()
{
	for(int i=0;i<=10;i++)
		System.out.println("Thread " + Thread.currentThread().getId()
                + " is running");
	
}
}

