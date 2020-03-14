package _1_5_Lists;

import java.util.Scanner;

/*
!!! ОТЛИЧИЕ ОТ HardPalindrome В ТОМ, ЧТО ДАННАЯ ПРОГРАММА РЕАЛИЗОВАНА ЧЕРЕЗ SrtingBuilder !!!

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
public class HardPalindrome2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strIn = in.next();
        StringBuilder str = new StringBuilder();
        str.append(strIn);

        // делаем пока строка str не будет равна обратной
        int i = 0;
        while (!str.toString().equals(str.reverse().toString())) {
            str.reverse();
            // добавляем в i-ый элемент в i-ую позицию с конца (length() - i)
            str.insert(str.length() - i, str.charAt(i));
            i++;
        }
        str.reverse();
        System.out.println(str);
    }
}