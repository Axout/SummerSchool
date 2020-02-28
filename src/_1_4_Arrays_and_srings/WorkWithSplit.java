package _1_4_Arrays_and_srings;

import java.util.Scanner;
/*
Сплит
Дана строка вида термин - определение1, определение2, определение3, .....
Необходимо вывести ответ в формате:
Термин:
-определение1
-определение2
-определение3
*********************
Sample Input 1:
banana - a, b, c, d, e

Sample Output 1:
banana:
-a
-b
-c
-d
-e
*********************
 */
public class WorkWithSplit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arrStr = str.split("-");
        System.out.println(arrStr[0].replace(' ', ':'));
        String[] words = arrStr[1].split(",");
        for (String word : words) {
            System.out.println(word.replace(' ', '-'));
        }
    }
}
