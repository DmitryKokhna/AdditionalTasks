package cycledowhile;


public class cycledowhile {
    public static void main(String[] arg){
        /*
// ЗАДАЧА 1 ИЗ JAVA RUSH
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();
        do{
            System.out.println(string);
            number--;
        }
        while (number > 0 && number < 4);

        */

        //ЗАДАЧА 2
        //Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.
        int i=1;
        do{
            if(i%5 ==0){
                System.out.println(i);
            }
           i++;
        } while(i<=100);

    }

}
