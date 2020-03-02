package _1_4_Arrays_and_srings;

import java.util.Scanner;
/*
Вычитание строк
Вычитанием строк назовем операцию при которой все буквы вычитаемого вычеркиваются из уменьшаемого,
а если в уменьшаемом таких букв не было они дописываются в конец уменьшаемого в порядке обхода вычитаемого от 0 индекса к последнему.
Например: abcdef - abcfonpq = deonpq или abcdef - fedcloj = abloj или abcdef - fealobjm = cdlojm
*********************
Sample Input 1:
abcdef abcfonpq
Sample Output 1:
deonpq
*********************
Sample Input 2:
abcdef fedcloj
Sample Output 2:
abloj
*********************
Sample Input 3:
abcdef fealobjm
Sample Output 3:
cdlojm
*********************
 */
public class SubtractionLines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        StringBuilder minuend = new StringBuilder(str1);
        StringBuilder deductible = new StringBuilder(str2);

        String difference = subtractionLines(minuend, deductible);
        System.out.println(difference);
    }
    public static String subtractionLines(StringBuilder minuend, StringBuilder deductible) {
        // вычитаем каждый элемент строки deductible из строки minuend
        for (int i = 0; i < deductible.length(); i++) {
            // находим индекс вычитаемого элемента в строке minuend
            int index = minuend.indexOf(deductible.substring(i,i+1));
            // если такой элемент есть, то вычитаем его и из minuend и из deductible
            if (index != -1) {
                minuend.deleteCharAt(index);
                deductible.deleteCharAt(i);
                i--;
            }
        }
        // возвращаем строку состоящую из остатка minuend и остатка deductible
        return minuend.append(deductible).toString();
    }
}
