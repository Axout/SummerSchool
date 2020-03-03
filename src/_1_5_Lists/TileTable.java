package _1_5_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Замостить таблицу словом
Дано слово состоящее из букв в любом регистре. Необходимо вывести на экран таблицу в соответствии с примером:
Пусть слово = "abcde", тогда таблица должна быть вот такой -
a b c d e
b 0 0 0 d
c 0 0 0 c
d 0 0 0 b
e d c b a
Где пустое пространство заполняется нулями!
Расстояние между буквами на выводе - 1 пробел
*********************
Sample Input 1:
abcde

Sample Output 1:
a b c d e
b 0 0 0 d
c 0 0 0 c
d 0 0 0 b
e d c b a
*********************
Sample Input 2:
recursion

Sample Output 2:
r e c u r s i o n
e 0 0 0 0 0 0 0 o
c 0 0 0 0 0 0 0 i
u 0 0 0 0 0 0 0 s
r 0 0 0 0 0 0 0 r
s 0 0 0 0 0 0 0 u
i 0 0 0 0 0 0 0 c
o 0 0 0 0 0 0 0 e
n o i s r u c e r
*********************
 */
public class TileTable {
    public static void main(String[] args) {
        // инициализируем список, с которым будем работать
        ArrayList<String> list = new ArrayList<>();
        // считываем слово
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        // из строки делаем массив букв
        String[] arrStr = str.split("");
        // записываем массив букв в список
        Collections.addAll(list, arrStr);
        // форматированный вывод
        int length = list.size();
        for (int i = 0; i < length; i++) {
            // выводим первую строчку
            if (i == 0) {
                for (String value : list) { System.out.printf("%s ", value); }
                System.out.println();
            }
            // выводим последнюю строчку (в обратном порядке согласно заданию)
            if (i == length-1) {
                Collections.reverse(list);
                for (String value : list) { System.out.printf("%s ", value); }
            }
            // выводим средние(внутренние) строчки
            if (i != 0 && i != length-1) {
                for (int k = 0; k < length; k++) {
                    // вывод первой буквы
                    if (k == 0) { System.out.printf("%s ", list.get(i)); }
                    // вывод последней буквы
                    if (k == length-1) { System.out.printf("%s \n", list.get(length-1 - i)); }
                    // вывод нулей
                    if (k != 0 && k != length-1) { System.out.print("0 "); }
                }
            }
        }
    }
}
