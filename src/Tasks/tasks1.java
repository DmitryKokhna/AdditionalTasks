package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class tasks1 {
    public static void main(String[] arg) throws IOException {
        //   За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        //   Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
        //   А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//       Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.

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
    }
}

