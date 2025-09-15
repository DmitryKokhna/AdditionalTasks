package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        arrayList.add("a");
//        arrayList.add("1");
//        arrayList1.add(1);
//        arrayList.add("s");
//        arrayList.add("d");
//        arrayList.add("f");
//        arrayList.add("g");
//        arrayList.add("a");
//        arrayList.add(0, "11");
//        for (String name : arrayList) {
//            System.out.println(name);
//        }
//        List<String> arrayList2 = new ArrayList<>();
//        System.out.println(arrayList);
//        List<String> l1 = List.of("b","n","m");
//    arrayList.addAll(l1);
//    arrayList.forEach(a-> System.out.println(a));
// String[] ar = arrayList.toArray(new String[0]);
//        System.out.println(Arrays.toString(ar));

        List<String> fake = Collections.nCopies(5, "Привет");

        ArrayList<String> list =  new ArrayList<>(Collections.nCopies(5, "Привет")) ;

        for(String s: list)
            System.out.println(s);
    }
}
