package _1_8_Set_and_Map;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Друзья
Вводится несколько строк по два слова в каждой - имена двух друзей.
Дружба - вещь взаимная(с двух сторон!!!). Иначе люди - не друзья.
Необходимо вывести ответ в соответствии с примерами ниже - список друзей.
Список состоит из имен людей, список выстроен в лексографическом порядке(по алфавиту) по возрастанию,
после имени человека идет фраза " дружит с : ", далее следует список имен его друзей,
выстроенный так же по возрастанию.
******************************************
Sample Input 1:
Mike Nike
Oleg Petr
Mike Petr
Ivan Oleg

Sample Output 1:
Ivan дружит с : Oleg
Mike дружит с : Nike Petr
Nike дружит с : Mike
Oleg дружит с : Ivan Petr
Petr дружит с : Mike Oleg
******************************************
Sample Input 2:
Валентина Ольга
Аня Иван
Майкл Соня
Умберто Хулио
Иван Петр
Петр Соня
Иван Соня
Аня Соня
Валентина Соня
Умберто Соня
Хулио Соня
Василий Соня

Sample Output 2:
Аня дружит с : Иван Соня
Валентина дружит с : Ольга Соня
Василий дружит с : Соня
Иван дружит с : Аня Петр Соня
Майкл дружит с : Соня
Ольга дружит с : Валентина
Петр дружит с : Иван Соня
Соня дружит с : Аня Валентина Василий Иван Майкл Петр Умберто Хулио
Умберто дружит с : Соня Хулио
Хулио дружит с : Соня Умберто
******************************************
Sample Input 3:
Петр Иван
Иван Петр
Олег Иван
Петр Олег

Sample Output 3:
Иван дружит с : Олег Петр
Олег дружит с : Иван Петр
Петр дружит с : Иван Олег
******************************************
 */
public class Friends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // инициализируем словарь, в который будем заносить данные
        TreeMap<String, TreeSet<String>> map = new TreeMap<>();
        // гоняем цикл, пока сканнер получает непустую строку
        while(in.hasNextLine()) {
            String s = in.nextLine();
            // если строка входящая пустая, то выходим из цикла
            if (s.isEmpty()) break;
            // если нет - то:
            else {
                // парсим строку
                String[] ss = s.split(" ");
                String name1 = ss[0];
                String name2 = ss[1];
                // если имя уже есть в словаре, то добавлем друга в его множество
                if (map.containsKey(name1))
                    map.get(name1).add(name2);
                // если нет, то добавляем имя в словарь и создаём множество его друзей
                else {
                    TreeSet<String> set = new TreeSet<>();
                    set.add(name2);
                    map.put(name1, set);
                }
                // аналогично для второго друга, ведь дружба - вещь взаимная
                if (map.containsKey(name2))
                    map.get(name2).add(name1);
                else {
                    TreeSet<String> set = new TreeSet<>();
                    set.add(name1);
                    map.put(name2, set);
                }
            }
        }
        // выводим словарь друзей
        printMap(map);
    }
    public static void printMap(TreeMap<String, TreeSet<String>> map){
        // внешний цикл выводит словарь map
        for (String i : map.keySet()) {
            System.out.print(i + " дружит с : ");
            // внутренний цикл выводит множество set
            for (String k : map.get(i))
                System.out.print(k + " ");
            System.out.println();
        }
    }
}
