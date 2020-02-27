package _1_4_Arrays_and_srings;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/*
Наибольший возрастающий срез массива
Срезом будем считать последовательность подряд идущих элементов массива, где каждый следующий элемент больше предыдущего.
Для последовательности 1 2 3 1 2 5 7 1 2 1 2, существуют возрастающие срезы: 1 2 3, 1 2 5 7, 1 2, 1 2 вывести нужно срез 1 2 5 7
Для последовательности 1 2 3 1 2 5 1 2 7, существуют срезы 1 2 3, 1 2 5, 1 2 7 вывести нужно все срезы, так как они равной длины
Формат входных данных:
Дано натуральное число N, далее следуют N целых чисел.
Формат выходных данных:
В первой строке выведите длину максимального среза
Далее выведите содержание среза/срезов, разделяя элементы одним пробелом, каждый срез с новой строки
*********************
Sample Input 1:
7
2 1 2 3 1 5 7
Sample Output 1:
3
1 2 3
1 5 7
*********************
Sample Input 2:
5
1 2 3 4 5
*********************
Sample Output 2:
5
1 2 3 4 5
*********************
Sample Input 3:
7
1 2 1 5 1 7 1
Sample Output 3:
2
1 2
1 5
1 7
*********************
 */
public class LargestRisingSubarray {
    public static void main(String[] args) {
        // считываем строку
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) { arr[i] = in.nextInt(); }

        // находим возрастающие срезы и разделяем их дефисами
        String strSep = separateString(arr);
        System.out.println("Строка после разделения:\n" + strSep);

        // находим длину максимального среза (считаем кол-во пробелов срезе)
        String[] slices = strSep.split("- ");
        int maxCountSpace = 0;
        for (String slice : slices) {
            if (maxCountSpace < StringUtils.countMatches(slice, " ")) {
                maxCountSpace = StringUtils.countMatches(slice, " ");
            }
        }
        System.out.println("Длина максимально возрастающего среза = " + maxCountSpace);

        // выводим все наибольшие возрастающие срезы (у которых число пробелов равно максимальному)
        for (String slice : slices) {
            if (StringUtils.countMatches(slice, " ") == maxCountSpace) {
                System.out.println(slice);
            }
        }
    }

    public static String separateString(int[] arr) {
        StringBuilder str = new StringBuilder();
        str.append(arr[0]);
        str.append(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                str.append("- ");
            }
            str.append(arr[i+1]);
            str.append(" ");
        }
        return str.toString();
    }
}
