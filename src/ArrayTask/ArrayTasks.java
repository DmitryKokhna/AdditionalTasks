package ArrayTask;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.SocketHandler;

public class ArrayTasks {
    public static void main(String[] args) {
/*
        //ЗАДАЧА_1 Заменить каждый элемент массива с нечетным индексом на ноль
        // Условие задачи:
        //   1. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
        //   2. Выведите массив на экран в строку
        // 3. Замените каждый элемент с нечётным индексом на ноль
        //   4. Снова выведете массив на экран на отдельной строке
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = (int) (Math.random() * 10+1);
                    }
        for (int i = 0; i < 8; i++) {
            System.out.print(array[i]+ " ");
        }
        for (int i=0;i<array.length;i++)
        {
          if(i%2==0){
        array[i]=0;
        }
        }
        System.out.println("------------");
        for (int i = 0; i < 8; i++) {
            System.out.print(array[i]+" ");
        }
*/

/*
       // ЗАДАЧА_2 Среднее арифметическое элементов массива
       //  Условие задачи:
       //1. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
       //2. Выведите массивы на экран в двух отдельных строках
       //3. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
       // для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)

        int arraySize = 5;
        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array1[i] = (int) (Math.random() * (5 - 0) + 1);
            array2[i] = (int) (Math.random() * (5 - 0) + 1);
        }

        System.out.print("array1: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.print("array2: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array2[i] + " ");
        }

        int totalSumArray1 = 0;
        int totalSumArray2 = 0;
        for (int i = 0; i < arraySize; i++) {
            totalSumArray1 = totalSumArray1 + array1[i];
            totalSumArray2 = totalSumArray2 + array2[i];
        }
        double midArray1 = 1.0 * totalSumArray1 / arraySize;
        double midArray2 = 1.0 * totalSumArray2 / arraySize;
        System.out.println();
        System.out.println(midArray1);
        System.out.println(midArray2);
        if (midArray1 > midArray2) {
            System.out.println("Массив 1 больше");
        } else if (midArray1 == midArray2) {
            System.out.println("Массив 1 равен Массив 2");
        } else {
            System.out.println("Массив 2 больше");
        }
*/

 /*
        //ЗАДАЧА3_ Создать второй массив из четных элементов первого массива
        // Условие задачи:
        // 1. Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3. Введенное пользователем число сохраняется в переменную n.
        // 2. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        // 3. Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        // 4. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран
        System.out.println("Введите размер массива. Размер должен быть больше 3 (три)");
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        while (n <= 3) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 3) {
                    System.out.println("Введено неверный размер массива. Вы ввели размер равный: " + n);
                }
            } else {
                System.out.println("Введено не число");
                scanner.next();
            }
        }
        int[] array = new int[n];
        int countEven = 0; //счетчик для опредедения количествао четных элементов в массиве
        //заполняем массив
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (n + 1));
        }
        System.out.println("Массив из случайных чисел состоящий из " + n + " чисел");
        //выводим исходных массив
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
        //тут проверяем этементы исходного массива на четность и не 0, и определяем размер массива  из четных значений
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                countEven++;
            }
        }
        int[] arrayEven = new int[countEven];
        if (countEven > 0) {
            System.out.println();
            System.out.println("Массив счетными числами создан");
            System.out.println("Элементов в массиве: " + countEven);
        } else {
            System.out.println("Массив счетными числами НЕ создан");
        }
        // тут формируем массив из четных значений исходного массива
        int indexArrayEven = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                arrayEven[indexArrayEven] = array[i];
                indexArrayEven++;
            }
        }
        System.out.println("ЧЕТНЫЙ массив");
        for (int i = 0; i < indexArrayEven; i++) {
            System.out.print(arrayEven[i] + ", ");
        }
*/

/*
        // ЗАДАЧА_2 Одномерный массив типа String.
        // Создать массив типа String с размером 7.
        // Записать в него значения дней недели.
        // Вывести на консоль значение последнего элемента.

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[7];
        for (int i = 0; i < 7; i++) {
            if (i==0){
                array[i]="Пн";
            } else if (i==1) {
                array[i]="Вт";
            } else if (i==2) {
                array[i]="Ср";
            } else if (i==3){
                array[i]="Чт";
            } else if (i==4) {
                array[i]="Пт";
            } else if (i==5) {
                array[i]="Сб";
            }   else {
                array[i]="Вс";
            }
        }
        // Вывод всех
        for (int i = 0; i < 7; i++) {
            System.out.println(array[i]);

        }
        int lastIndex= array.length-1;
       // ВЫвод одного последнего
        System.out.println("Последний элемент:");
        System.out.println(array[lastIndex]);
 */

 /*
        // ЗАДАЧА_3
        // Одномерный массив типа double.
        // Создать массив типа double с размером 4.
        // Записать в него любые значения с помощью блока для инициализации.
        // Вывести на консоль значение первого элемента.
        double[] array = new double[4];

        for (int i = 0; i < 4; i++) {
            array[i] = Math.round(Math.random()*10);
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(array[i]+ " ");
        }
*/


/*        //ЗАДАЧА_4
        // Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        // отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
        // Перед созданием массива подумайте, какого он будет размера.
        // 2 4 6 … 18 20
        // 2
        // 4
        // 6
        // …
        // 20

        int countedArraySize = 0;

// Определяем размер массива, продсчетом кол-ва четных чисел из диапазона 1-20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                countedArraySize++;
            }
        }
        System.out.println(countedArraySize);
//создаем и заполняем массив
        int[] arrayEven = new int[countedArraySize];
        for (int i = 0; i < arrayEven.length; i++) {
            for (int j = 1; j <= 20; j++) {
                if (j % 2 == 0) {
                    arrayEven[i] = j;
                    i++;
                }
            }
        }
        //выводим массив в строку
        for (int i = 0; i < arrayEven.length; i++) {
            System.out.print(arrayEven[i] + " ");
        }
        //выводим массив в строку
        for (int i = 0; i < arrayEven.length; i++) {
            System.out.println(arrayEven[i] + " ");
        }
   */


 /*       //ЗАДАЧА_5
        //Создайте массив из 15 случайных целых чисел из отрезка [0;9].
        // Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
        // и выведете это количество на экран на отдельной строке.

        int[] array = new int[15];
        int evenCounter = 0;
//заполняем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
            if (i > 0 && i % 2 == 0) {
                evenCounter++;
            }
        }
        System.out.println();
        System.out.println("EventCounter: " + evenCounter);
*/
        //ЗАДАЧА_6
//        Создайте массив из 4 случайных целых чисел из отрезка [10;99],
//        выведите его на экран в строку. Определить и вывести на экран сообщение о том,
//        является ли массив строго возрастающей последовательностью.
/*
        int[] array = new int[4];
        // массив для проверки + Math. random закомментить.
        //  int[] array = {2,2,3,4};
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90);
            System.out.print(array[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] > array[i + 1]) || (array[i] == array[i + 1])) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("возрастающи");
        } else {
            System.out.println("не возраст");
        }

 */

/*
          // ЗАДАЧА_7
          // Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
          // Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
        int[] array12 = new int[12];
        int max = array12[0];
        int index = 0;
        for (int i = 0; i < array12.length; i++) {
            array12[i] = ThreadLocalRandom.current().nextInt(-15, 15);
            System.out.print("Индекс:" + i + " + Значение:" + array12[i] + "| ");
        }
        for (int i = 1; i < array12.length; i++) {
            if (array12[i] > max) {
                max = array12[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Индекс, где расположено наибоьше число: " + index);
*/

 /*
        //ЗАДАЧА_8
        // Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
        // выведите массив на экран в строку. Определите какой элемент встречается в массиве чаще всего
        // и выведите об этом сообщение на экран. Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

        int[] array11 = new int[11];
        int countForOne = 0;
        int countForZero = 0;
        int contForOneMinus = 0;

        System.out.println("Массив: ");
        for (int i = 0; i < array11.length; i++) {
            array11[i] = ThreadLocalRandom.current().nextInt(-1, 1);

            System.out.print(array11[i] + " | ");
            if (array11[i] == 0) {
                countForZero++;
            } else if (array11[i] == 1) {
                countForOne++;
            } else if (array11[i] == -1) {
                contForOneMinus++;
            }
        }
        System.out.println("\n");
        if ((countForZero > countForOne) && (countForZero > contForOneMinus)) {
            System.out.println("Итог:" + "\n" + "'0' представлен больше раз в массиве, так он появляется " + countForZero + " раз" + "," + "\n" + "'1' " + countForOne + " раз, " + "'-1' " + contForOneMinus + " раз.");

        } else if (countForOne > contForOneMinus && countForOne > countForZero) {
            System.out.println("Итог:" + "\n" + "'1' представлен больше раз в массиве, так он появляется " + countForOne + " раз" + "," + "\n" + "'1' " + countForZero + " раз, " + "'-1' " + contForOneMinus + " раз.");
        } else if (contForOneMinus > countForOne && contForOneMinus > countForZero) {
            System.out.println("Итог:" + "\n" + "'-1' представлен больше раз массиве, так он появляется " + contForOneMinus + " раз" + "," + "\n" + "'1' " + countForOne + " раз, " + "'0' " + countForZero + " раз.");
        }
 */

        //ЗАДАЧА_9
        // Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
        // чтобы отрицательных и положительных элементов там было поровну и не было нулей.
        // При этом порядок следования элементов должен быть случаен
        // (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных,
        // а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
        //  Вывести полученный массив на экран.
/*
        int[] array12 = new int[12];
        int countPositive = 6;
        int countNegative = 6;

        for (int i = 0; i < array12.length; i++) {
            int temp;
            // в DO_WHILE генерируем число и проверяем что число!=0, и ечли оно >0 или <0, то проверяем счетчит по количеству таких чисел
            do {
                temp = ThreadLocalRandom.current().nextInt(-10, 10);
            } while (temp == 0 || (temp > 0 && countPositive == 0) || (temp < 0 && countNegative == 0));
            //тут в зависимости от числа изменяем счетчик, т.к. каждого типа н едолжн обыть больше 6 (половина массива)
            if (temp > 0) {
                countPositive--;
            } else {
                countNegative--;
            }
            array12[i] = temp;
            System.out.print(array12[i] + " ");
        }

        System.out.println();
        // тут просто проверяем, что если счетчик ==0, значит все положительные/отрицательные числа заполнены.
        System.out.println("+ " + countPositive);
        System.out.println("- " + countNegative);
*/
        int[] array = {1, 2, 3, 4};
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;

        }
        System.out.println(Arrays.toString(array));


    }
}



















