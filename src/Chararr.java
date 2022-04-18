import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Chararr {

	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int t=in.nextInt();
		        int temp;
		        for(int i=0;i<t;i++)
		        {
		            int a=in.nextInt();
		            int b=in.nextInt();
		            int n=in.nextInt();
		            temp =b;
		            for(int j=0;j<n;j++)
		            {
		            		
		                a=a+b;
		                if(j>0)
		                {
		                System.out.print(" ");
		                }
		                System.out.print(a);
		                b=b*2;		                
		            }
		            System.out.println("");
		        }
		        in.close();
	}

}
