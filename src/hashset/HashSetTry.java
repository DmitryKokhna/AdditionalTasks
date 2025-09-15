package hashset;


import java.util.HashSet;

public class HashSetTry {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        set.add("Привет");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Ciao");
        set.add("Namaste");
HashSet<String> set1 = new HashSet<>(set);
      //  Iterator<String> it = set.iterator();
        for (String s : set1){
            if (s.equals("Привет")){
                System.out.println(1);

            }
        }
    }
}
