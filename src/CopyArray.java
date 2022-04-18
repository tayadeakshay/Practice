import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[][] e = {{20,30},{1,2},{65,75}};
		
		int[] a = {1,2,3,4,7,6};
		int[] x = new int[a.length];
		int[] y = new int[5];
//		try {
//		System.arraycopy(a,0,x,0,a.length);
//		System.out.println(Arrays.toString(x));
//		}
//		catch(Exception e)
//		{
//		System.arraycopy(a,2,y,3,2);
//		System.out.println(Arrays.toString(y));
//		}
		
		int[] z = Arrays.copyOfRange(a,1,5);
		System.out.println(Arrays.toString(z));
		
		int[][] f = new int[e.length][];
		for(int i=0;i<e.length;i++) {
		f[i] = new int[e[i].length];
		for(int j=0;j<e[i].length;j++) {
			f[i][j] = e[i][j];
		}
		}
		System.out.println(Arrays.deepToString(f));
		
//		int[] p = a;
//		
//		a[2] = 7;
//		
//		for(int c:p)
//		{
//			System.out.print(c +" ");
//		}
//		
//		System.out.println();
//		
//		int[] b = new int[6];
//		
//		//System.out.print(d+" ");
//		}
//		
//		System.out.println(Arrays.toString(b));
//		
////		for(int i=0;i<a.length;i++)
////		{
////			System.out.print(a[i]+" ");
////		}
	}

}
