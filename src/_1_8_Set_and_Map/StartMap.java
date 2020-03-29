package _1_8_Set_and_Map;

import java.util.Scanner;
import java.util.TreeMap;

/*
Сделать из строки словать (список используемых букв) и хранить информацию о количесве этих букв.
*********************
Sample Input 1:
fdjsfl;djs;ldjf;asldf ewopw

Sample Output 1:
a : 1
d : 4
e : 1
f : 4
j : 3
l : 3
o : 1
p : 1
s : 3
w : 2
*********************
 */
public class StartMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (map.containsKey(s.charAt(i)))
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                else
                    map.put(s.charAt(i), 1);
            }
        }
        for (Character ch : map.keySet()) {
            System.out.println(ch + " : " + map.get(ch));
        }
    }
}
