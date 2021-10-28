import java.util.Scanner;

public class substring {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		System.out.println(S.substring(start,end));
	}
}
