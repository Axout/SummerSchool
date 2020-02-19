import java.util.Random;
import java.util.Scanner;
/*
﻿Реализуйте функцию сортировки массива по возрастанию.

Самое короткое решение:
java.util.Arrays.sort(a);

*********************
Sample Input 1:
5
5 1 2 4 3
*********************
Sample Output 1:
1 2 3 4 5
*********************
 */
public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        add(arr);
        printArr(arr);
        sort(arr);
        printArr(arr);
    }
    // сортировка массива пузырьком
    public static void sort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    // наполнение массива случайными числами от 0 до 100
    public static int[] add(int[] arr) {
        Random r = new Random();
        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
//        for (Integer i : a) {
//            i = r.nextInt(100);
//        }
        return arr;
    }
    // вывод массива
    public static void printArr(int[] arr) {
        for (Integer i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
