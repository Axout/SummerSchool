package _1_5_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Слияние списков
Даны два списка. Необходимо слить два списка в один, отсортировать по убыванию и вывести.
Вводится целое число N и N чисел со следующей строки, потом целое число M и М чисел со следующей строки.
*********************
Sample Input 1:
5
1 2 3 4 5
7
5 4 3 1 2 6 7

Sample Output 1:
7 6 5 5 4 4 3 3 2 2 1 1
*********************
 */
public class MergeLists {
    public static void main(String[] args) {
        // Инициализация списков
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        // ПЕРВЫЙ СПИСОК
        // Считываем количество элементов
        int n1 = in2.nextInt();
        // Считываем строку и создаём массив строк разделяя введённую строку пробелом
        String[] arrStr1 = in.nextLine().split(" ");
        // Каждый элемент массива строк преварщаем в int и записываем в список
        for (String i : arrStr1) { list1.add(Integer.parseInt(i)); }

        // ВТОРОЙ СПИСОК
        // Считываем количество элементов
        int n2 = in2.nextInt();
        // Считываем строку и создаём массив строк разделяя введённую строку пробелом
        String[] arrStr2 = in.nextLine().split(" ");
        // Каждый элемент массива строк преварщаем в int и записываем в список
        for (String i : arrStr2) { list2.add(Integer.parseInt(i)); }

        //System.out.println(n1+n2);

        // Сливаем два списка в один
        list1.addAll(list2);
        // Сортируем и разворачиваем
        Collections.sort(list1);
        Collections.reverse(list1);

        // Вывод на консоль в формате, который требует проверяющая система
        for (Integer i : list1) { System.out.printf("%d ", i); }
    }
}
