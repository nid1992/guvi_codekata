import java.util.Scanner;

public class StringRev {
	
	public static void main(String a[]) {
		
		String s = new String();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter string");
		s=new Scanner(System.in).nextLine();
		if (s.length()<=100000) {
			StringBuilder sb = new StringBuilder(s);
			sb = sb.reverse();
			System.out.println("rev =");
			System.out.println(sb);
		}
	}

}
