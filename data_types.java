import java.util.Scanner;

class data_types{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            try{
                long input = sc.nextLong();    //max size variable
                System.out.println(input + " can be fitted in:");
                if (input >= -128 && input <= 127){     //byte can store numbers in range -2^7 to (2^7) -1
                    System.out.println("* byte");
                }                   
                if (input>= -(Math.pow(2, 16 - 1)) && input <= (Math.pow(2, 16 - 1)-1)){	//short can store numbers in range -2^15 to (2^15) -1
                System.out.println("* short"); 
                }
                if (input >= -(Math.pow(2, 32 - 1)) && input <= (Math.pow(2, 32 - 1) - 1)){		//int can store numbers in range -2^31 to (2^31) -1
                    System.out.println("* int");   
                }
                if (input >= -(Math.pow(2, 64 - 1)) && input <= (Math.pow(2, 64 - 1) - 1)){		//long can store numbers in range -2^63 to (2^63) -1
                    System.out.println("* long");
                }  
            }
            catch (Exception e){
                System.out.println(sc.next() + " can't be fitted anywhere.");  //out of range numbers
            }
        }
    }
    
}
