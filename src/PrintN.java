import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Реализуйте процедуру, которая выводит на экран последовательность в соответствии с условием.
Sample Input 1:
3
Sample Output 1:
122333
Sample Input 2:
4
Sample Output 2:
1223334444
Sample Input 3:
2
Sample Output 3:
122
 */
public class PrintN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printN(n);

        //ArrayList<>
    }
    public static void printN(int n) {
        //ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(n); // to string!!!!!!!!!!!!!!!!
        }
        n--;
        if (n > 0) printN(n);
        Collections.reverse(list);
        String str = list.toString();
        //System.out.printf("%s", str);
        System.out.print(str);
    }
}
