package _1_8_Set_and_Map;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String, TreeSet<String>> map = new TreeMap<>();
        // добавление в phonebook
        for (int i = 0; i < 4; i++) {
            String s = in.nextLine();
            String[] ss = s.split(" ");
            String name = ss[0] + ss[1];
            String number = ss[2];
            if (map.containsKey(name))
                map.get(name).add(number);
            else {
                TreeSet<String> set = new TreeSet<>();
                set.add(number);
                map.put(name, set);
            }
        }
        // вывыод из phonebook
        for (String name : map.keySet()) {
            System.out.print(name + " : ");
            for (String number : map.get(name))
                System.out.print(number + " ");
            System.out.println();
        }
    }
}
