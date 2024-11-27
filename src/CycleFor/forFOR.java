package CycleFor;

import java.util.Scanner;

public class forFOR {
    public static void main(String[] arg) {
        // ЗАДАЧА1
        // Необходимо вывести на экран числа от 1 до 5. На экране должно быть:
        //  1 2 3 4 5

      /*
      for(int i=1; i<=5;i++){
            System.out.println(i);
        }
     */

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
    }
}

