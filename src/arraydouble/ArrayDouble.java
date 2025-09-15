package arraydouble;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayDouble {

    public static void main(String[] args) {

/*

        //ЗАДАЧА_1
        // Таблица умножения
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

/*
        // ЗАДАЧА_2
        //  Создать массив типа String размером 3х6.
        //  И записать в него значения:
        //   a1  a2  a3  a4  a5  a6
        //   b1  b2  b3  b4  b5  b6
        //   c1  c2   c3  c4  c5  c6
        //   Распечатать массив.

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
      */


/*
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
 */


   /*     //ЗАДАЧА_4
        // Поиск максимального и минимального значения в каждой строке массива.
        // Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
        // Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
        // Распечатать массив, содержащий максимальное и минимальное значение.

        int[][] array = new int[5][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(-10, 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[][] minMaxArray = new int[array.length][2];

        int coordinateVforMax = 0, coordinateHforMax = 0;
        
        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];

            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    coordinateVforMax = i;
                    coordinateHforMax = j;

                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

            //Выводит координаты для мин значений в каждой строке
            System.out.println("Координаты (номер,т.е. индекс + 1) Мин_значения в строке:\nдля строка №" + (i+1) + ": горизонт " + (coordinateVforMax+1) + " / вертикаль " + (coordinateHforMax+1) + ". Хранимое значение: " + min);
            // Заполняем новый массив
            minMaxArray[i][0] = min; // Минимальное значение
            minMaxArray[i][1] = max; // Максимальное значение
        }

        // Вывод значений нового массива
        System.out.println("Новый двумерный массив (мин, макс):");
        for (int i = 0; i < minMaxArray.length; i++) {
            System.out.println(minMaxArray[i][0] + "," + minMaxArray[i][1]);
        }
*/

/*
        // ЗАДАЧА_5
        // максимальный  элемент двумерного массива
        // минимальный  элемент двумерного массива

        System.out.println("Введите количество строк в массиве");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int arraySizeV = scanner.nextInt();
        System.out.println("Введите количество элементов в строке");
        int arraySizeH = scanner.nextInt();
        scanner.close();

        int[][] array5 = new int[arraySizeV][arraySizeH];

        //заполняем массив
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = ThreadLocalRandom.current().nextInt(0, 15);
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }
        int maxValue = array5[0][0];
        int minValue = array5[0][0];

        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                if (array5[i][j] > maxValue) {
                    maxValue = array5[i][j];
                }
                if (array5[i][j] < minValue) {
                    minValue = array5[i][j];
                }
            }
        }

        System.out.println("\n" + "Максимальное значение: " + maxValue + "\n");
        System.out.println("Минимальное значение: " + minValue);
 */

  /*
        // ЗАДАЧА_6
        // Вычислить сумму всех элементов двумерного массива.

        int totalSum = 0;

        // Задаем размерномть массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нужно задать размер массива.");
        System.out.print("Задайте количество 'элементов' в каждой строке массива: ");
        int array6SizeByH = scanner.nextInt();
        System.out.print("Задайте количество 'строк' в массиве: ");
        int array6SizeByV = scanner.nextInt();
        System.out.println("Будет создан массив размерностью: " + array6SizeByH + " x " + array6SizeByV);


        int[][] array6 = new int[array6SizeByH][array6SizeByV];

        // Заполняем массив случайными значениями
        System.out.println("\nЗадайте минимальную и максимальную границу диапазона чисел для заполения массива \n");
        System.out.print("Минимум: ");
        int minRange = scanner.nextInt();

        System.out.print("Максимум: ");
        int maxRange;
        int[,] ar2= new int[2][2];

        //проверяем, границы диапазона
        do {
            maxRange = scanner.nextInt();
            if (maxRange <= minRange) {
                System.out.print("Минимум должен быть больше и НЕ равен максимуму.\n Повторите ввод: ");
            }
        }
        while (maxRange <= minRange);

        scanner.close();

        System.out.println("Заполненный массив и сумму элементов массива");
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                array6[i][j] = ThreadLocalRandom.current().nextInt(minRange, maxRange);
                totalSum = totalSum + array6[i][j];
                // выводим
                System.out.print(" " + array6[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Общая сумма элментов массива: " + totalSum);
*/

/*
        //ЗАДАЧА_7
        // Дан двумерный массив. Определить:
        // а) максимальное значение среди элементов N столбца массива;
        // б) минимальное значение среди элементов Y строки массива.

        Scanner scanner = new Scanner(System.in);

        // задаем количество столбцов
        System.out.print("Количество столбцов: ");
        int arraySizeByH = scanner.nextInt();
        // задаем количество строк
        System.out.print("Количество строк: ");
        int arraySizeByV = scanner.nextInt();
        int[][] array7 = new int[arraySizeByH][arraySizeByV];
        //задаем номер столбца
        //проверку >< не делаем
        System.out.print("Каком столбце искать: ");
        int columnIndex = scanner.nextInt() - 1;
        //задаем номер строки
        System.out.print("Какой строке искать: ");
        int stringIndex = scanner.nextInt() - 1;
        // заполняем массив
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                array7[i][j] = ThreadLocalRandom.current().nextInt(-10, 10);
                System.out.print(" " + array7[i][j] + " ");
            }
            System.out.println();
        }
        int maxColumn = array7[0][columnIndex];
        for (int i = 1; i < array7.length; i++) {
            if (array7[i][columnIndex] > maxColumn) {
                maxColumn = array7[i][columnIndex];
            }
        }
        System.out.println("Максимальное значение в колонке " + (columnIndex+1) + " : " + maxColumn);
        int minString = array7[stringIndex][0];

        for (int j = 1; j < array7[stringIndex].length; j++) {
            if (array7[stringIndex][j] < minString) {
                minString = array7[stringIndex][j];
            }
        }
        System.out.println("Минимальное значение в строке " + (stringIndex+1) + " : " + minString);
*/

    /*    
        //ЗАДАЧА_8
        //Дан двумерный массив. Определить:
        //а) номер столбца, в котором расположен минимальный элемент четвертой строки массива.
        //Если элементов с минимальным значением в этой строке несколько,
        // то должен быть найден номер столбца самого левого из них;

        int[][] array7 = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {2, 1, 0, 14}
        };
        int rowIndex = 3;
        int minValue = array7[rowIndex][0];
        int minIndex = 0;

        for (int j = 1; j < array7[rowIndex].length; j++) {
            if (array7[rowIndex][j] < minValue) {
                minValue = array7[rowIndex][j];
                minIndex = j;
            }
        }
        System.out.println("Индекс столбца: " + minIndex + ". Таким образом его номер: " + (minIndex + 1));
       */


        //ЗАДАЧА_9
//        В двумерном массиве хранится информация о баллах,
//        полученных спортсменами-пятиборцами в каждом из пяти видов спорта
//        (в первой строке — информация о баллах первого спортсмена, во второй — второго и т. д.).
//        Общее число спортсменов равно 20. Определить:
//        а) сколько баллов набрал спортсмен-победитель соревнований;
//        б) сколько баллов набрал спортсмен, занявший последнее место.
//        Обе задачи решить двумя способами:
//        1) с использованием дополнительного одномерного массива;
//        2) без использования дополнительного одномерного массива.

        // ВАРИАНТ - 1 (с использованием дополнительного одномерного массива;)
        // !!! НЕ ПРОВЕРЯЕМ ДУБЛИКАТЫ
        int[][] tableWithMarks = new int[20][5];

        System.out.println("--Таблица с баллами--");
        for (int i = 0; i < tableWithMarks.length; i++) {
            for (int j = 0; j < tableWithMarks[i].length; j++) {
                tableWithMarks[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
                System.out.print("  " + tableWithMarks[i][j] + " ");
            }
            System.out.println();
        }

        int max;
        int min;
        int sportsmenWinner = 0;
        int sportsmenLoser = 0;
        int[] sumOfMarks = new int[20];

        for (int i = 0; i < tableWithMarks.length; i++) {
            int sum = 0;
            for (int j = 0; j < tableWithMarks[i].length; j++) {
                sum = sum + tableWithMarks[i][j];
                sumOfMarks[i] = sum;
            }
        }
        System.out.println("Сумма баллов каждого спортсмена: ");
        for (int i = 0; i < sumOfMarks.length; i++) {
            System.out.print(sumOfMarks[i] + " ");
        }

        max = sumOfMarks[0];
        min = sumOfMarks[0];
        int[] same = new int[20];
        for (int i = 1; i < sumOfMarks.length; i++) {
            if (sumOfMarks[i] > max) {
                max = sumOfMarks[i];
                sportsmenWinner = i;
            }

            if (sumOfMarks[i] < min) {
                min = sumOfMarks[i];
                sportsmenLoser = i;
            }

        }
        System.out.println();
        System.out.println("Максимальные баллы - " + max);
        System.out.println("Победитель № - " + (sportsmenWinner + 1));
        System.out.println("Минимальные баллы - " + min);
        System.out.println("Мнее всего набравший № - " + (sportsmenLoser + 1));

        System.out.println(Arrays.toString(same));
    }
}




