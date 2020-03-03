package _1_5_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Одинаковые элементы из двух списков
Дано два списка строками с целыми числами через пробел. Необходимо вывести уникальные элементы(1 раз - 1 элемент),
которые присутствуют и в первом и во втором списке. Элементы необходимо вывести в порядке возрастания.
Гарантируется что хотя бы 1 одинаковый элемент в списках есть.
*********************
Sample Input 1:
1 2 3 4 5 6 7 8 9 10
7 8 1 1 1 11 1 1 1 11 1 1 11 1 1 1

Sample Output 1:
1 7 8
*********************
Sample Input 2:
1 2 3 4 5 6 7 8 9 10 11 12
2 3 100 500

Sample Output 2:
2 3
*********************
Sample Input 3:
1 51 61 51 51 3153 48111 2 121 51 8 1 51 5 1 1 5
51 515 1181 1 1 512 215 15 151 8 98 54 545 48 8 78 945191 91

Sample Output 3:
1 8 51
*********************
 */
public class Identicalitems {
    public static void main(String[] args) {
        // инициализируем два списка с исходными данными
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // инициализируем список с результатами
        ArrayList<Integer> listResult = new ArrayList<>();
        // считываем строки
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        // из строк делаем массивы строк
        String[] arrStr1 = str1.split(" ");
        String[] arrStr2 = str2.split(" ");
        // каждый элемент массива строк преварщаем в int и записываем в список
        for (String i : arrStr1) { list1.add(Integer.parseInt(i)); }
        for (String i : arrStr2) { list2.add(Integer.parseInt(i)); }
        // удаляем повторяющиеся элементы
        removeDuplicates(list1);
        // сортируем список, чтобы выводимый результат был уже отсортирован по возрастанию
        Collections.sort(list1);
        // собираем список с уникальными элементами
        for (Integer i1 : list1) {
            if (list2.contains(i1)) {
                listResult.add(i1);
            }
        }
        // выводим список
        for (Integer i1 : listResult) { System.out.printf("%d ", i1); }
    }
    public static void removeDuplicates (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}
