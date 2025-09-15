package scanner;
import java.util.Scanner;
        
              
        

public class ScannerTask {
    public static void main(String[] args) {


Scanner scanner = new Scanner(System.in);
        //   String a = scan.next();

        Scanner scan = null;
        scan.useDelimiter(" ");
        String s;

        if (scan.hasNext()) {
            while (scan.hasNext()) {
                s = scan.next();
                System.out.println(s);
            }
        } else {
            scan.close();
        }
/* ЗАДАЧА 2
Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x % 2 == 0 && x > max) {
                max = x;
            }
        }
        System.out.println(max);
 */

    }
}
