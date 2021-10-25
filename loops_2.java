import java.util.Scanner;

class loops_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i=0; i<q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int result = a;
            for (int j=0; j<n; j++){
                result += Math.pow(2,j) * b;    // 2^j 
                System.out.print(result + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
