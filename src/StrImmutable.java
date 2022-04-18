
public class StrImmutable {

	public static void main(String[] args) {
		String i =new String("20");
		i = "30";
		System.out.println(i.concat(" Abc"));
		String j = i;
		String k = new String("20");
		String l = "20";
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		i=k;
		i=i.concat(" pqr");
		System.out.println(i);
		boolean x = k==l; //op1
		System.out.println("Is location same: "+x);
	}

}
