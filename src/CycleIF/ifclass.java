package CycleIF;

public class ifclass {
   public static void main (String [] arg){

       /*
       Если температура выше 20 градусов — надеть рубашку
Если температура выше 10 градусов и меньше (или равна) 20 — надеть свитер
Если температура выше 0 градусов и меньше (или равна) 10 — надеть плащ
Если температура ниже 0 градусов — надеть пальто.
       */
       int temperature =1;

       if (temperature > 20)
           System.out.println("надеть рубашку");
       else // тут температура меньше (или равна) 20
           if (temperature > 10 && temperature <=20)
               System.out.println("надеть свитер");
           else // тут температура меньше (или равна) 10
               if (temperature > 0 && temperature <= 10)
                   System.out.println("надеть плащ");
               else // тут температура меньше 0
                   System.out.println("надеть пальто");
   }
}
