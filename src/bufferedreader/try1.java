package bufferedreader;

import java.io.IOException;

public class try1 {
    public static void main(String[] args) throws IOException {
    /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       /*   String str1 = bufferedReader.readLine();
        System.out.println("Строка: " + str1 );
*/
        //  BufferedReader bufferedReader1 =  new BufferedReader(new FileReader("C:\\Users\\Dima\\1.txt"));
        /*
        BufferedReader bufferedReader2 = new BufferedReader((new InputStreamReader(System.in)));
        String str1 = bufferedReader2.readLine();
        double a = Double.parseDouble(str1);
        System.out.println("Строка A: " + a);
        String str2 = bufferedReader2.readLine();
        double b = Double.parseDouble(str2);
        System.out.println("Строка B: " + b);

        if ((Math.abs(a - b)) > 0.001) {
            System.out.println("Числа не равны");
        }
*/
        int a = 1;
        int b = 2;
        int c = 0;
        if (a < b) {
            c = 3;
        }
        System.out.println(c);
    }
}
