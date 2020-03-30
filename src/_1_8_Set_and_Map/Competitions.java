package _1_8_Set_and_Map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*
Соревнования
Программа получает на вход N целых чисел - штрафные баллы i-ого участника и
К - мощность множества (количество элементов в нем).
Необходимо выбрать К - элементное множество из уникальных по величине штрафных баллов.
Необходимо вывести множество с минимальной суммой в порядке возрастания штрафных баллов через пробел или -1,
если такое множество получить нельзя.

Альтернативное условие:
Вам дают "список" цен некого одного товара, вы этот список фильтруете/сортируете
(TreeSet<Integer> удаляете дубликаты и сортируете по возрастанию цены).
Далее вас просят: верните "несколько" сортированных "цен" товара и вы возвращаете "несколько"  цен.

первое число - countIn - это количество данных вам цен,
второе число - countOut - это сколько цен нужно вернуть после сортировки,
остальные цифры это цены на условный товар.

PS: не забудьте про возможные оказии.
К примеру, если попросят вернуть больше чем дают или больше чем есть в сортированном списке подсказка (-1).
*********************
Sample Input 1:
7 1
2 3 4 5 6 7 1

Sample Output 1:
1
*********************
Sample Input 2:
8 9
5 6 1 2 3 4 1 2

Sample Output 2:
-1
*********************
Sample Input 3:
10 5
55 1561 51 5 1 1 15 15 1 18

Sample Output 3:
1 5 15 18 51
*********************
 */
public class Competitions {
    public static void main(String[] args) {
        // парсим первую строку на countIn и countOut
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] ss = s.split(" ");
        int countIn = Integer.parseInt(ss[0]);
        int countOut = Integer.parseInt(ss[1]);

        // парсим вторую строку на массив чисел
        String s2 = in.nextLine();
        int[] ss2 = Arrays.stream(s2.split(" ")).mapToInt(Integer::parseInt).toArray();

//        System.out.println("******************");
//        System.out.println(countIn + "and" + countOut);
//        System.out.println("******************");
//        for (int i : ss2)
//            System.out.print(i + " ");
//        System.out.println("\n******************");

        // записываем массив во множество
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i : ss2)
            treeSet.add(i);
//        System.out.println(treeSet);
//        System.out.println("******************");

        // делаем проверку и выводим требуемое количесво элементов множества
        if (countOut > countIn || countOut > treeSet.size())
            System.out.println(-1);
        else {
            Iterator iterator = treeSet.iterator();
            for (int i = 0; i < countOut; i++)
                System.out.print(iterator.next() + " ");
        }
    }
}
