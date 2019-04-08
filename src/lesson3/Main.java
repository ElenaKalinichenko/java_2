package lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = {"мама", "мыла", "раму", "рак", "краб", "слон", "раму", "мыла", "раму", "мыла", "рак", "мыла", "раму", "мыла", "слон", "краб", "мама", "тигр", "раму", "крот", "раму", "слон", "мама"};

         Map<String, Integer> hm = new HashMap<>();
         HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            hs.add(array[i]);
            Integer res = hm.get(array[i]);

           //System.out.println(array[i] + " " + res);

            hm.put(array[i], res == null ? 1 : res + 1);
        }
        System.out.println(hs);
        System.out.println(hm);




    }
}
