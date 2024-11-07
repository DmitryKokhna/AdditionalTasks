package P1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//String a = "a'b'c";


        Scanner scan = new Scanner(System.in);
     //   String a = scan.next();

        scan.useDelimiter(" ");
String s;

if (scan.hasNext()) {
    while (scan.hasNext()) {
        s = scan.next();
        System.out.println(s);
    }

    }
else{
    scan.close();
}


    }
}
