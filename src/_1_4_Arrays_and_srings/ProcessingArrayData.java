package _1_4_Arrays_and_srings;

import java.util.Scanner;

/*
Дано целое число N, не превосходящее 1000. Далее следуют N целых чисел.
Среди всех чисел массива, необходимо вывести на экран двузначные, четные и положительные через пробел.
А если таких чисел в массиве нет, необходимо вывести -1.
*********************
Sample Input 1:
5
100 96 -2 96 1
*********************
Sample Output 1:
96 96
*********************
Sample Input 2:
7
1 2 3 4 5 6 7
*********************
Sample Output 2:
-1
*********************
Sample Input 3:
8
98 -98 98 -98 56 56 56 56
*********************
Sample Output 3:
98 98 56 56 56 56
*********************
 */
public class ProcessingArrayData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // число элементов в массиве
        int n = in.nextInt();
        int[] nums = new int[n];
        // считывание элементов массива из строки
        for (int i = 0; i < n; i++) { nums[i] = in.nextInt(); }

        // короткая форма заполнения массива из строки
        //String str = in.nextLine();
        //int[] nums = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean flag = true;
        for (Integer i : nums) {
            if ( (i >= 10 && i < 100) && (i % 2 == 0) ) {
                System.out.printf("%d ", i);
                flag = false;
            }
        }
        if (flag) System.out.println(-1);
    }
}