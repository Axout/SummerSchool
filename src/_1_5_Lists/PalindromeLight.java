package _1_5_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
Легкий палиндром
Дана строка. Из данной строки необходимо сделать палиндром следующим образом:
Берем исходную строку и к ней добавляем ее же, но в обратном порядке.
Например дано abcde, тогда ответ abcdeedcba
*********************
Sample Input 1:
abcde

Sample Output 1:
abcdeedcba
*********************
 */
public class PalindromeLight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(""))); // разбиваем строку на список

        int n = list.size();
        for (int i = n-1; i >= 0; i--) {
            list.add(list.get(i));
        }
        for (String s : list) {
            System.out.print(s);
        }
    }
}
