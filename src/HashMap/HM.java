package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HM {
    public static void main(String[] args) {
        HashMap<Integer, String> one = new HashMap<Integer, String>();
        one.put(1, "Дима");
        one.put(2, "Оля");
        one.put(3, "Катя");
        one.put(4, "Андрей");

        System.out.println(one.get(1));
        System.out.println(one.containsKey(5) + "*" + one.containsKey(1));
        System.out.println("Дима: " + one.containsValue("Дима") + " | " + "Саша: " + one.containsValue("Саша"));

        for (Integer key : one.keySet()) {
            Integer keyMap = key;
            String valueMap = one.get(key);
            System.out.println("Ключ: " + keyMap + "|" + "Значение: " + valueMap);
        }
        one.remove(2);
        Integer size_One = one.size();
        for (Integer key : one.keySet()) {
            Integer keyMap = key;
            String valueMap = one.get(key);
            System.out.println("Ключ: " + keyMap + "|" + "Значение: " + valueMap);
        }
        Integer size2_One = one.size();
        //    one.clear();
        for (Integer key : one.keySet()) {
            Integer keyMap = key;
            String valueMap = one.get(key);
            System.out.println("Ключ: " + keyMap + "|" + "Значение: " + valueMap);

        }
//        ArrayList<String> arrayList = new ArrayList<>( one.values());
//        for (String s : arrayList){
//            System.out.print (s+ " ");
//        for ( String s : one.values()){
//            System.out.println(s);
//        }
        for (Map.Entry<Integer,String> kv : one.entrySet()){
            System.out.println(kv + " ");
            Integer i = kv.getKey();
            String s = kv.getValue();
            System.out.println(i + s + " | ");
        }
        }


    }






