package ArrayTask;

import java.util.Scanner;

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
    }
}












