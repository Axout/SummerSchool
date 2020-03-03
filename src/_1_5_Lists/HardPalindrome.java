package _1_5_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Сложный палиндром
Дана строка. Из данной строки сделать палиндром минимально возможной длины.
*********************
Sample Input 1:
abcb

Sample Output 1:
abcba
*********************
Sample Input 2:
aaa

Sample Output 2:
aaa
*********************
 */
public class HardPalindrome {
    public static void main(String[] args) {
        // инициализируем исходный список
        ArrayList<String> list = new ArrayList<>();
        // инициализируем обратный список
        ArrayList<String> listReverse = new ArrayList<>();
        // инициализируем список-результат
        ArrayList<String> listPalindrome;
        // считываем слово
        Scanner in = new Scanner(System.in);
        String str = in.nextLine(); // в проверяющей системе нужно использовать next(); так как в задании в конце строки пробел
        // из строки делаем массив букв 
        String[] arrStr = str.split("");
        // записываем массив букв в список 
        Collections.addAll(list, arrStr);
//        System.out.println(list);
        // записываем во сторой список развёрнутый первый
        Collections.addAll(listReverse, arrStr);
        Collections.reverse(listReverse);
//        System.out.println(listReverse);

        // если list сам по себе не является палиндромом
        if (list.equals(listReverse)) listPalindrome = list;
        else {
            // находим индекс последнего одинакового элемента из списка listReverse,
            int indexLastSame = findLastSameIndex(list, listReverse);
//            System.out.println(indexLastSame);
            // прибавляем в конец оставшиеся неодинаковые элементы listReverse к list
            listPalindrome = addResidue(list, listReverse, indexLastSame);
        }

        // выводим кратчайший палиндром
        for (String i : listPalindrome) {
            System.out.print(i);
        }
    }
    public static int findLastSameIndex(ArrayList<String> list, ArrayList<String> listReverse) {
        int index = 0;          // индекс символа из list, с которым сравнивается символов из listReverse
        int indexLastSame = 0;  // индекс последнего одиннакового символа из listReverse
        for (int i = 0; i < listReverse.size(); i++) {
            for (int k = index; k < list.size(); k++) {
                if ( list.get(k).equals(listReverse.get(i)) ) {
                    index = k + 1;
                    indexLastSame = i;
                    break;
                }
            }
        }
        return indexLastSame;
    }
    public static ArrayList<String> addResidue(ArrayList<String> list, ArrayList<String> listReverse, int indexLastSame) {
        int i = 1;
        do {
            list.add(listReverse.get(indexLastSame + i));
            i++;
        }
        while (indexLastSame + i < listReverse.size());
        return list;
    }
}