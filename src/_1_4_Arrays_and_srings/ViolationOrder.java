package _1_4_Arrays_and_srings;

import java.util.Scanner;

/*
"Нарушенный порядок"
﻿Дано целое число N, не превосходящее 1000. Далее следуют N целых чисел.
Порядок нарушен тогда, когда среди двух соседних элементов массива левый элемент больше правого.
Программа должна считать количество нарушенных порядков в массиве и выводить это количество на экран.
*********************
Sample Input 1:
5
2 4 1 9 7
---------------------
Sample Output 1:
2
*********************
Sample Input 2:
7
1 2 3 4 5 6 7
---------------------
Sample Output 2:
0
*********************
Sample Input 3:
7
7 6 5 4 3 2 1
---------------------
Sample Output 3:
6
*********************
 */
public class ViolationOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrInt = new int[n];
        // считывание элементов массива из строки
        for (int i = 0; i < n; i++) { arrInt[i] = in.nextInt(); }
        int violation = checkOrder(arrInt);
        System.out.println(violation);
    }
    public static int checkOrder(int[] arrInt) {
        int count = 0;
        for (int i = 0; i < arrInt.length-1; i++) {
            if (arrInt[i] > arrInt[i+1]) count++;
        }
        return count;
    }
}
