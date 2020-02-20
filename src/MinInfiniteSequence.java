import java.util.Arrays;
import java.util.Scanner;

/*
Дана некоторая последовательность целых чисел. Необходимо вывести минимум этой последовательности.
*********************
Sample Input 1:
1 2 3 4 5 6 7 8 9 10 11 12 13 14
*********************
Sample Output 1:
1
*********************
Sample Input 2:
5 5 5 5 5 5 2 3 6 8 7 4 5 6 9 8 5 1 2 5 564 564 564 654 564 564 684 56 54 864 864 8 486
*********************
Sample Output 2:
1
*********************
Sample Input 3:
65456 454 564 561 51 684 84 8484 5 49 48 498 48 48 4 89 489 4 498 4 984 984 89 498 498
*********************
Sample Output 3:
4
*********************
 */
public class MinInfiniteSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        // Из строки str делаем массив строк с разделителем пробел.
        // Затем создаём новый массив int такой же длины как и массив строк,
        // где каждому элементу присваиваем преобразованный в int соответствующий элемент массива строк.
        int[] arrInt = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = getMin(arrInt);
        System.out.println(min);
    }
    public static int getMin(int[] arrInt) {
        int min = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] < min) {
                min = arrInt[i];
            }
        }
        return min;
    }
}
