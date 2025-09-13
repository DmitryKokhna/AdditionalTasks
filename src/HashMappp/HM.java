package HashMappp;

import java.util.HashMap;

public class HM {
    public static void main(String[] args) {
        HashMap<Integer,String> one = new HashMap<Integer,String>();
        one.put(1,"Дима");
        one.put(2, "Оля");
        one.put(3,"Катя");
        one.put(4,"Андрей");
        System.out.println(one.get(1));
    }
}
