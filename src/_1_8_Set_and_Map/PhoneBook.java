package _1_8_Set_and_Map;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Телефонная книга
В телефонную книгу заносится имя и номер телефона абонента.
У каждого абонента может быть несколько номеров. Но копии абонентов плодить нельзя.
*********************
Sample Input 1:
Ivanov Ivan +79031234545
Petrov Petr +79625552323
Ivanov Ivan +79159998899
Nikolaev Nikolay +79113335757

Sample Output 1:
IvanovIvan : +79031234545 +79159998899
NikolaevNikolay : +79113335757
PetrovPetr : +79625552323
*********************
 */
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
