package P161124;

import java.util.Scanner;

public class cl1 {
    public static void main(String[] arg) {

        //напишите тут ваш код

        Scanner console = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x % 2 == 0 && x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}







