package CycleDoWhile;


import java.util.Scanner;

public class cycledowhile {
    public static void main(String[] arg){
// ЗАДАЧА ИЗ JAVA RUSH
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();
        do{
            System.out.println(string);
            number--;
        }
        while (number > 0 && number < 4);
    }

}
