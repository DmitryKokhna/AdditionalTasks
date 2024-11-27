package while_c_s;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class while_c_s {
    public static void main(String[] arg) {
        int i = 1;
        while (i <= 20) {
            i++;
            if ((i % 7) == 0) continue;
            System.out.println(i);

        }
    }
}
        //напишите тут ваш код
     /*   int stringCount = 0;

        while (stringCount < 10) {
            int columnCount = 0;

            while (columnCount < 20) {
                if ((stringCount == 0 || stringCount == 9) && (columnCount == 0 || columnCount == 19)) {
                    System.out.print("Б");
                }
                    else
                    {
                        System.out.print(" ");
                    }
                    columnCount++;
                }
                System.out.println();
                stringCount++;

            }
*/

    /*    //Задача №1:
        //Необходимо вывести на экран числа от 1 до 7. То есть на экране должно быть: 1 2 3 4 5 6 7
        int i=1;
        while (i<8){
            System.out.println(i);
            i++;
        }


        // Задача №2:
        //  Необходимо вывести на экран вот такую последовательность чисел: 100 90 80 70 60 50 40 30 20 10
        //вар_1 решение

     */
    /*    int i = 100;
        while (i > 1){
            System.out.println(i);
            i-=10;
        }
*/

// вар_2 решение
     /*   int i = 100;
        while (i > 1) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
            i--;
        }
*/









