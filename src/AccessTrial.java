
public class AccessTrial {

	public static void main(String[] args) 
	{
		int no = 5;
for(int i=0;i<no;i++){
for(int j=no-1;j>i;j--){
System.out.print(" ");	
}

for(int k=0;k<=i;k++){
System.out.print(" *");	
}
System.out.println();
}


for(int i=0;i<no;i++){
for(int j=0;j<=i;j++){
System.out.print(" ");	
}

for(int k=no-1;k>i;k--){
System.out.print(" *");	
}
System.out.println();
}	

}

}
