import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
Даны три списка целых чисел строками через пробел.
Первая строка - первый список, вторая - второй, третья - третий.
Из первого списка нужно выбрать положительные элементы, из второго - четные, из третьего - кратные 7.
Все выбранные элементы необходимо объединить в единый список и вывести его в порядке не убывания.
*********************
Sample Input 1:
1 2 3 4 -2 -2 -2 -2
2 5 4 3 9 7 8 1 7 12 16
7 21 15 16 19 18
*********************
Sample Output 1:
1 2 2 3 4 4 7 8 12 16 21
*********************
 */
public class ThreeLists {
    public static void main(String[] args) {
        // Инициализируем три списка
        ArrayList<Integer> list1 = new  ArrayList<>();
        ArrayList<Integer> list2 = new  ArrayList<>();
        ArrayList<Integer> list3 = new  ArrayList<>();
        // Считываем три строки
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine(), str2 = in.nextLine(), str3 = in.nextLine();
        // Из строк делаем массивы строк
        String[] arrStr1 = str1.split(" "), arrStr2 = str2.split(" "), arrStr3 = str3.split(" ");
        // Каждый элемент массива строк преварщаем в int и записываем в список
        for (String i : arrStr1) { list1.add(Integer.parseInt(i)); }
        for (String i : arrStr2) { list2.add(Integer.parseInt(i)); }
        for (String i : arrStr3) { list3.add(Integer.parseInt(i)); }

        // Удаляем из первого списка неположительные элементы
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) <= 0) {
                list1.remove(i);
                i--;
            }
        }

        // Удаляем из второго списка нечётные элементы
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) % 2 != 0) {
                list2.remove(i);
                i--;
            }
        }

        // Удаляем не кратные 7
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i) % 7 != 0) {
                list3.remove(i);
                i--;
            }
        }

        // Соединяем всё в одни список
        list1.addAll(list2);
        list1.addAll(list3);

        // Сортируем объединённый список
        Collections.sort(list1);

        // Вывод на консоль в формате, который требует проверяющая система
        for (Integer i : list1) {
            System.out.printf("%d ", i);
        }
    }
}
