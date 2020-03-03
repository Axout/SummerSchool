package _1_5_Lists;

import java.util.ArrayList;
import java.util.Scanner;
/*
Обработка списка
Существует ряд методов для класса ArrayList:
add(n) - вставка в конец, add(i, n) - вставка по индексу,
remove(i) - удаление по индексу, set(i, n) - изменение значения по индексу.
На вход программе подаются строки, первая из которых create N - создает исходный список с числами от 1 до N включительно.

Сигнатуры остальных команд:
add 5 - вставляет 5 в конец списка
add 5 6 - вставляет 6 по индексу 5
remove 7 - удаляет 7 элемент списка
set 7 3 - заменяет значение седьмого элемента списка на 3
Команда printList - сигнализирует о конце ввода данных и должна вывести на экран список, полученный после всех манипуляций
*********************
Sample Input 1:
create 30
add 12
add 17
add 3 15
remove 4
set 12 34
printList

Sample Output 1:
1 2 3 15 5 6 7 8 9 10 11 12 34 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 12 17
*********************
 */
public class ListProcessing {
    public static void main(String[] args) {
        // Сканер для считывания исходной строки
        Scanner in = new Scanner(System.in);
        String str;
        // Создаём список
        ArrayList<Integer> list = new ArrayList<>();

        do {
            // Считываем строку
            str = in.nextLine();
            // Делаем массив строк, раделитель - пробел
            String[] arrStr = str.split(" ");
            // System.out.println(Arrays.toString(arrStr));
            switch (arrStr[0]) {
                case "create":
                    // Добавляем в список n элементов от 1 до n
                    for (int i = 1; i <= Integer.parseInt(arrStr[1]); i++) {
                        list.add(i);
                    }
                    break;
                case "add":
                    if (arrStr.length > 2) {
                        list.add(Integer.parseInt(arrStr[1]), Integer.parseInt(arrStr[2]));
                    }
                    else {
                        list.add(Integer.parseInt(arrStr[1]));
                    }
                    break;
                case "remove":
                    list.remove(Integer.parseInt(arrStr[1]));
                    break;
                case "set":
                    list.set(Integer.parseInt(arrStr[1]), Integer.parseInt(arrStr[2]));
                    break;
                case "printList":
                    for (Integer integer : list) {
                        System.out.printf("%d ", integer);
                    }
                    break;
            }
        }
        while (!str.equals("printList"));
    }
}
