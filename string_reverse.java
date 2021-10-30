import java.util.Scanner;
public class string_reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
		sc.close();
        boolean flag = true;
        for (int i=0; i<s.length() /2; i++){
            if (s.charAt(i) != s.charAt(s.length() -1 -i)){
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");        
    }
}
