import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
Реализуйте процедуру, которая выводит на экран последовательность в соответствии с условием.
*********************
Sample Input 1:
4
*********************
Sample Output 1:
1223334444
*********************
 */
public class PrintN {
    public static void main(String[] args) {
        // считываем число
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // запускаем нашу рекурсивную функцию
        printN(n);
    }
    public static void printN(int n) {
        // создаём список
        ArrayList<Integer> list = new ArrayList<>();
        // добавляем в список n раз число n
        for (int i = 0; i < n; i++) {
            list.add(n);
        }
        // после каждого вызова функции n уменьшаем на единицу
        n--;
        // УСЛОВИЕ ОСТАНОВКИ РЕКУРСИИ:
        // пока n больше нуля
        if (n > 0) printN(n);
        // разворачиваем готовый список (чтобы был по возрастанию)
        Collections.reverse(list);
        // для корректного вывода преобразуем список в массив и выводим результат
        Object[] arr = list.toArray();
        for (Object i : arr) {
            System.out.print(i);
        }
    }
}
