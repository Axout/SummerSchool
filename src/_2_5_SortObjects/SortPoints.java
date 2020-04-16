package _2_5_SortObjects;

import _2_2_Methods_Fields.MainArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Сортируем точки
﻿Программа получает на вход целое число N, далее следуют N пар значений x, y - координаты текущей точки.
Необходимо выстроить все точки по увеличению их удаленности от начала координат и
вывести отсортированный спиcок точек на экран в формате :
(1; 2)
(2: 7)
........

Необходимо учесть, что координаты могут принимать как положительные так и отрицательные значения!
*********************
Sample Input 1:
5
1 2
3 7
-2 3
1 1
3 5

Sample Output 1:
(1; 1)
(1; 2)
(-2; 3)
(3; 5)
(3; 7)
*********************
Sample Input 2:
7
1 2
5 4
79 48
132 -1
-1 -3
5 6
123 123

Sample Output 2:
(1; 2)
(-1; -3)
(5; 4)
(5; 6)
(79; 48)
(132; -1)
(123; 123)
*********************
Sample Input 3:
1
1 1

Sample Output 3:
(1; 1)
*********************
 */
public class SortPoints {
    public static class Points {
        int x, y;

        public Points(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Points[] points = new Points[N];

        // считывание двухмерного массива
        for (int i = 0; i < N; i++) {
            points[i] = new Points(Integer.parseInt(in.next()), Integer.parseInt(in.next()));
        }
        // вывод точек до сортировки
        System.out.println("\nДо сортировки:");
        for (Points p : points) System.out.println("(" + p.x + "; " + p.y + ")");
        // сортировка точек
        Arrays.sort(points, Comparator.comparingInt(o-> (int) (Math.sqrt(o.x * o.x + o.y * o.y))));
        // вывод точек после сортировки
        System.out.println("\nПосле сортировки");
        for (Points p : points) System.out.println("(" + p.x + "; " + p.y + ")");

        // вывод двухмерного массива
        //printTwoArrays(arr);
    }
    public static void printTwoArrays(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints)
                System.out.printf("%d ", anInt);
            System.out.println();
        }
    }
}
