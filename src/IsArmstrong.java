
public class IsArmstrong {

	public static void main(String[] args) {
		int a = 371;
		int temp1 = a;
		int count =0;
		int rem,res=0;
		
		while(temp1 != 0)
		{
			rem = temp1%10;
			count = count+1;
			temp1= temp1/10;
		}
		int temp2 =a;
		int rem2;
		int arm =0;
		
		while(temp2 != 0)
		{
			int multi =1;
		rem2 = temp2%10;
		temp2 = temp2/10;
		for(int i=1;i<=count;i++)
		{
			multi =multi*rem2;
		}
		arm = arm + multi;
		}
		System.out.println(arm);

	}

}
