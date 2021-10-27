//NOTE: This first code is suited for JAVA 7 and will be accepted by Hackerrank.
//From JAVA 8 onwards " java.time.LocalDate " makes this problem easier. The updated code is written below. 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR,year);
String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        return dayOfWeek;
    }

}

public class Solution {
  public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

//Updated Code:-

// import java.time.LocalDate;
// import java.util.Scanner;
// public class date_time {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int date = sc.nextInt();
//         int month = sc.nextInt();
//         int year = sc.nextInt();
//         sc.close();
//         LocalDate l = LocalDate.of(year, month, date);
//         System.out.println(l.getDayOfWeek());
//     }
// }
