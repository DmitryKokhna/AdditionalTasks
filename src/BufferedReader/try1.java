package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class try1 {
    public static void main(String[] args) throws IOException {
    /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       /*   String str1 = bufferedReader.readLine();
        System.out.println("Строка: " + str1 );
*/
        BufferedReader bufferedReader1 =  new BufferedReader(new FileReader("C:\\Users\\Dima\\1.txt"));
        String str2 = bufferedReader1.readLine();
        System.out.println("Строка: " + str2 );
    }
}
