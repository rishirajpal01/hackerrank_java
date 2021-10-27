import java.util.Scanner;

public class string_introduction {
    private static String capFirstLetter(String str) {
        if (str == null || str.length() == 0) {   //In case of null string
            return "";
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1);  //Capitalises the first letter + Remaining characters; substring(1) = charAt(1) -> until the end of string
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        
        System.out.println(A.length() + B.length());
         
        System.out.println( A.compareTo(B) > 0 ? "Yes" : "No");
        
        System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
    }
}
