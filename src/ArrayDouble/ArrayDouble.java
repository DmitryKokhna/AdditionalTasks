package ArrayDouble;

import java.util.Arrays;

public class ArrayDouble {

    public static void main(String[] args) {

/*
        //ЗАДАЧА_1
        int[][] MULTIPLICATION_TABLE;
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
            int a = MULTIPLICATION_TABLE[0].length;
        }
*/

        // ЗАДАЧА_2
        //  Создать массив типа String размером 3х6.
        //  И записать в него значения:
        //   a1  a2  a3  a4  a5  a6
        //  b1  b2  b3  b4  b5  b6
        //   c1  c2   c3  c4  c5  c6
        // Распечатать массив.

        String[][] array2 = new String[3][6];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (i == 0) {
                    array2[i][j] = "a" + (j + 1);
                } else if (i == 1) {
                    array2[i][j] = "b" + (j + 1);
                } else {
                    array2[i][j] = "c" + (j + 1);
                }
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        //ЗАДАЧА_3_1
        //Двумерный массив типа char.
        //Создать двумерный массив типа char размером 4х2.
        //Записать в него значения с помощью блока для инициализации.
        //Распечатать значения массива.
char[][] arrayChar = new char[4][2];
        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = 0; j < arrayChar[i].length; j++) {
               arrayChar[i][j] = 'a';
                System.out.print( arrayChar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        char[][] arrayChar2 = new char[][] {{'a','b'},{'c','d'},{'e','f'},{'g','h'}};
        for (int i = 0; i < arrayChar2.length; i++) {
            for (int j = 0; j < arrayChar2[i].length; j++) {
                arrayChar[i][j] = 'a';
                System.out.print( arrayChar2[i][j] + " ");
            }
            System.out.println();
        }
    }

}