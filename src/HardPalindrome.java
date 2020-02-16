import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Дана строка. Из данной строки сделать палиндром минимально возможной длины: 
***************** 
Sample Input 1: 
abcb 
***************** 
Sample Output 1: 
abcba 
***************** 
 */
public class HardPalindrome {
    public static void main(String[] args) {
        // инициализируем список, с которым будем работать 
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listTmp = new ArrayList<>();
        // считываем слово 
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        // из строки делаем массив букв 
        String[] arrStr = str.split("");
        // записываем массив букв в список 
        Collections.addAll(list, arrStr);
        System.out.println(list);
        // записываем во сторой список развёрнутый первый
        Collections.addAll(listTmp, arrStr);
        Collections.reverse(listTmp);
        System.out.println(listTmp);
        // находим одинаковые части
        System.out.println(findSame(list, listTmp));
        // вычитаем из второго списка одинаковую часть 

        // прибавляем остаток к первому списку 

        // выводим кратчайший палиндром 
    }
    public static int findSame(ArrayList<String> list, ArrayList<String> listTmp) {
        int t = 0;
        int index = 0;
        for (int i = 0; i < listTmp.size(); i++) {
            for (int k = index; k < list.size(); k++) {
                if (list.contains(listTmp.get(i))) {
                    index = k + 1;
                    t = i;
                    break;
                }
                //else return -1;
            }
        }
        return t;
    }
}