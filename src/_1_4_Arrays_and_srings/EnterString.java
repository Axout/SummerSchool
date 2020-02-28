package _1_4_Arrays_and_srings;

import java.util.Scanner;

/*
Программа получает на вход две строки.
Необходимо вывести строку, меньшую в лексографическом порядке.
*********************
Sample Input 1:
mother brother
Sample Output 1:
brother
*********************
Sample Input 2:
look picture
Sample Output 2:
look
*********************
Sample Input 3:
cook soup
Sample Output 3:
cook
*********************
 */
public class EnterString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        if (str1.compareTo(str2) >= 0) { System.out.println(str2); }
        if (str1.compareTo(str2) < 0) { System.out.println(str1); }
    }
}
