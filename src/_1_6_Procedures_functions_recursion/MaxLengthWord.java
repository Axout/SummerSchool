package _1_6_Procedures_functions_recursion;

import java.util.Arrays;
import java.util.Scanner;
/*
Самое длинное слово
Реализуйте функцию, возвращающую самое длинное слово из переданного массива.
Если таких слов много - необходимо вернуть наименьшее в лексографическом порядке.
*********************
Sample Input 1:
i'm gonna make a change for once in my life it's gonna feel real good gonna make aaaaaa

Sample Output 1:
difference
*********************
Sample Input 2:
Every night in my dreams i see you i feel you that is how i know you go on far across the distance and spaces between us you have come to show you go on

Sample Output 2:
distance
*********************
 */

public class MaxLengthWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // считываем строку
        String str = in.nextLine();
        // из строки делаем массив слов
        String[] s = str.split(" ");
        // вывод массива
        //for (String word : s) { System.out.println(word); }
        // вызываем функцию, которая возращает слово максимальной длины
        System.out.println(maxLengthWord(s));
    }
    public static String maxLengthWord(String[] s) {
        // сортируем массив в лексографическом порядке
        Arrays.sort(s);
        // задаём первое слово текущим максимальным
        String maxWord = s[0];
        // дальше сравниваем текущее максимальное слово со следующим словом в массиве
        for (int i = 1; i < s.length; i++) {
            // если следующее слово больше, то меняем текущее максимальное слово
            if (maxWord.length() < s[i].length()) maxWord = s[i];
        }
        return maxWord;
    }
}
