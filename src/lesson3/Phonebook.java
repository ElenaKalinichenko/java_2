package lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    HashMap<String, HashSet<String>> hm;

    public Phonebook() {
        this.hm = new HashMap<>();
    }

    public void add(String name, String phone) {
        HashSet<String> hs = hm.getOrDefault(name, new HashSet<>());
        hs.add(phone);
        hm.put(name, hs);
    }

    public void get(String name) {
        if(hm.containsKey(name)) {
            System.out.println(name+"  "+hm.get(name));
        } else {
            System.out.println(name+"  не найден в списке");
        }
    }

    public static void main(String[] args) {

        Phonebook book = new Phonebook();
        book.add("Иванов", "4544665");
        book.add("Иванов", "9885758");
        book.add("Петров", "5656656");
        book.add("Петров", "34545446");
        book.add("Сидоров", "5656377");
        book.add("Сидоров", "465654646");
        book.add("Пупкин", "24333406");

        book.get("Иванов");
        book.get("Петров");
        book.get("Рак");

    }
}
