package CycleFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class forFOR {
    public static void main(String[] arg) throws IOException {
 /*
        // ЗАДАЧА1
        // Необходимо вывести на экран числа от 1 до 5. На экране должно быть:
        //  1 2 3 4 5


      for(int i=1; i<=5;i++){
            System.out.println(i);
        }
     */

/*
        //ЗАДАЧА2
        //Необходимо вывести на экран таблицу умножения на 3 (НО переделаем на универсальную)
        int multiplicand;
        int result;
        int maxSecondDigit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое МНОЖИМОЕ: ");
        if (scanner.hasNextInt()) {
            multiplicand = scanner.nextInt();
            System.out.print("Введите целое МНОЖИТЕЛЬ: ");
            if (scanner.hasNextInt()) {
                maxSecondDigit = scanner.nextInt();
                for (int multiplier = 1; multiplier <= maxSecondDigit; multiplier++) {
                    result = multiplicand * multiplier;
                    System.out.println(multiplicand + " * " + multiplier + " = " + result);
                }
            } else {
                System.out.println("Введено значение для МНОЖИТЕЛЬ не является целым чилом или является строкой. Повторите.");
            }
        } else {
            System.out.println("Введено значение для МНОЖИМОЕ не является целым числом или явлеется строкой. Повторите.");
        }
*/

 /*
        //ЗАДАЧА3
        // Напишите программу, где пользователь вводит любое целое положительное число.
        // А программа суммирует все числа от 1 до введенного пользователем числа.
        Scanner scanner = new Scanner(System.in);
        int end = 0;
        int sum = 0;
        if (scanner.hasNextInt()) {
            end = scanner.nextInt();
        }
        if (end > 0) {
            for (int i = 0; i < end; i++) {
                sum = sum + i;
            }

        }
        System.out.println(sum);
        */
/*
        // ЗАДАЧА 5 -   За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        // Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
        // А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
        //  Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.

        int interestRate = 7;
        double sum;
        int amountMonthEntered;
        double resultSum = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ввведите сумму вклада: ");
        sum = Integer.parseInt(reader.readLine());
        System.out.print("Вы ввели сумму вклада: " + sum);
        System.out.println();

        System.out.print("Ввведите количество месяцев: ");
        amountMonthEntered = Integer.parseInt(reader.readLine());
        System.out.print("Вы ввели количество месяцев: " + amountMonthEntered);
        System.out.println();
        for (int startCountMonth = 1; startCountMonth <= amountMonthEntered; startCountMonth++) {
            sum = sum + (sum * interestRate / 100);
            System.out.println("Сумма с процентами за " + startCountMonth + "-ый: " + Math.round(sum * 100) / 100.0);
        }
        resultSum = Math.round(sum * 100) / 100.0;
        System.out.println("Итого: " + resultSum);



*/
/*

        // ЗАДАЧА 6 - Напишите программу, которая выводит на консоль таблицу умножения
        for(int i=1;i<=9;i++){
            for(int j=1; j<=9; j++){
                int result = i*j;
                System.out.print(result + " ");
            }
            System.out.println();
        }
*/
// ЗАДАЧА 7 - Найти сумму всех целых чисел от 100 до 500.
        int totalAmount = 0;
        for (int start = 100; start <= 500; start++) {
            totalAmount = totalAmount + start;
        }
        System.out.println("Итоговое число: " + totalAmount);

    }
}

