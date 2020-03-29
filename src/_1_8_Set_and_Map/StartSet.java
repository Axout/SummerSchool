package _1_8_Set_and_Map;

import java.util.Scanner;
import java.util.TreeSet;

/*
Сделать из строки словать (список используемых букв).
*********************
Sample Input 1:
fdjsfl;djs;ldjf;asldf ewopw

Sample Output 1:
a d e f j l o p s w
*********************
 */
public class StartSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Character> treeSet = new TreeSet<>();
        String s = in.nextLine();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') treeSet.add(s.charAt(i));
        System.out.println(treeSet);

        for (Character i : treeSet) {
            System.out.print(i + " ");
        }
    }
}
