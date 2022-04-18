
public class StarPattern2 {

	public static void main(String[] args) {
		int no =5;
for(int i=0;i<no;i++)
{
for(int j=no-1;j>i;j--)
{
System.out.print("  ");	
}

for(int j=0;j<=(i*2);j++)
{
	if(j>0 && j<(i*2))
	{
		System.out.print("  ");
	}
	else
	{
System.out.print(" *");	
}}
//System.out.print("*");
System.out.println();
}
	}

}
