import java.util.Scanner;
public class end_of_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){   //until you provide input
            System.out.println(i+ " " + sc.nextLine());
            i++;
        }
        sc.close();
    }
}
