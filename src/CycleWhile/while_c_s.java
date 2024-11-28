package CycleWhile;

public class while_c_s {
    public static void main(String[] arg) {
/*
    //ЗАДАЧА1 - вывести числа кратные 7
        int i = 1;
        while (i <= 20) {
            i++;
            if ((i % 7) == 0) continue;
            System.out.println(i);

        }
    }
}
*/


        // ЗАДАЧА2 - Выводи фигуру
        int stringCount = 0;
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

/*
      //Задача 3:
      //Необходимо вывести на экран числа от 1 до 7. То есть на экране должно быть: 1 2 3 4 5 6 7
        int i=1;
        while (i<8){
            System.out.println(i);
            i++;
        }
*/

/*
        // Задача 4: вар_1 решение
        //  Необходимо вывести на экран вот такую последовательность чисел: 100 90 80 70 60 50 40 30 20 10

   int i = 100;
        while (i > 1){
            System.out.println(i);
            i-=10;
        }
*/

/*
      // Задача 4: вар_2 решение
      int i = 100;
        while (i > 1) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
            i--;
        }
*/

/*
     // ЗАДАЧА 5 -   За каждый месяц банк начисляет к сумме вклада 7% от суммы.
     // Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
     // А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
    //  Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.

        int interestRate = 7;
        double sum;
        int monthEntered;
        double resultSum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ввведите сумму вклада: ");
        sum = Integer.parseInt(reader.readLine());
        System.out.print("Вы ввели сумму вклада: " + sum);
        System.out.println();

        System.out.print("Ввведите количество месяцев: ");
        monthEntered = Integer.parseInt(reader.readLine());
        System.out.print("Вы ввели количество месяцев: " + monthEntered);
        System.out.println();

        while (monthEntered > 0) {
            sum = sum + (sum * 7 / 100);
            monthEntered--;
            System.out.println(Math.round(sum*100)/ 100.0);
            if (monthEntered == 0) {
                resultSum =Math.round(sum*100)/ 100.0;
            }
        }
        System.out.println(resultSum);
 */
        }
    }
}






