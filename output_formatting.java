import java.util.Scanner;

public class output_formatting {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++){
			String s1=sc.next();
			int x=sc.nextInt();
			System.out.printf("%-15s%03d\n", s1, x);     //Notice the printf, %s and %d. "-" for left justification and 15 as given condition. "0" for filling space and "3" for 3 digit requirement.
		}
		System.out.println("================================")
		}
}
