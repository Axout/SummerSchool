package _1_6_Procedures_functions_recursion;

import java.util.Scanner;

/*
Палиндром
﻿Палиндромом называется такая строка, которая читается в обе стороны одинаково.
Пробелы, регистр и знаки препинания не влияют на палиндромность.
Например А роза,,,,упала На ЛАПУ А з о р а - палиндром,   а роза упала на лапу азору - не палиндром
*********************
Sample Input 1:
aaaaaAAa
Sample Output 1:
true
*********************
Sample Input 2:
aaab
Sample Output 2:
false
*********************
Sample Input 3:
A b C d cBA
Sample Output 3:
true
*********************
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        // создаём сканер для считывания исходной строки
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        // проверяем строку на палиндромность
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        // из полученной строки делаем массив символов, чтобы прверить каждый символ является ли он буквой или нет?
        char[] chars = s.toCharArray();
        // если символ - буква, то добавляем его в стрингбилдер, чтобы потом сравнить его с реверсом
        StringBuilder strFinal = new StringBuilder();
        for (char i : chars) {
            // если символ - буква, то добавляем в strFinal
            if (Character.isLetter(i)) { strFinal.append(i); }
        }
        // сравниваем без учёта регистра strFinal (стрингбилдер состоящий только из букв) со strFinal, только реверсированным
        // но поскольку метод equals из класса String, то стрингбилдер нужно привести к стрингу
        return strFinal.toString().equalsIgnoreCase(strFinal.reverse().toString());
    }
}
