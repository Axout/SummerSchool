import java.util.ArrayList;
import java.util.Scanner;

/*
Дано два списка строками с целыми числами через пробел. Необходимо вывести уникальные элементы(1 раз - 1 элемент),
которые присутствуют и в первом и во втором списке. Элементы необходимо вывести в порядке возрастания.
Гарантируется что хотя бы 1 одинаковый элемент в списках есть.
*******************
Sample Input 1:
1 2 3 4 5 6 7 8 9 10
7 8 1 1 1 11 1 1 1 11 1 1 11 1 1 1
*******************
Sample Output 1:
1 7 8
*******************
 */
public class EqualFromLists {
    public static void main(String[] args) {
        // Инициализируем два списка
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // Считываем строки
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine(), str2 = in.nextLine();
        // Из строк делаем массивы строк
        String[] arrStr1 = str1.split(" "), arrStr2 = str2.split(" ");
        // Каждый элемент массива строк преварщаем в int и записываем в список
        for (String i : arrStr1) { list1.add(Integer.parseInt(i)); }
        for (String i : arrStr2) { list2.add(Integer.parseInt(i)); }

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    System.out.printf("%d ", list1.get(i));
                    break;
                }
            }
        }
        //list1.contains();
    }
}
