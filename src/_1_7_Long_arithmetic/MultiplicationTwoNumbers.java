package _1_7_Long_arithmetic;

import java.math.BigInteger;
import java.util.Scanner;

/*
Произведение двух длинных чисел
*********************
Sample Input 1:
56516515616515615615656156151616 11656516165165156516165165

Sample Output 1:
658785677882723285223840272699554862329752715360637656640
*********************
Sample Input 2:
5 5

Sample Output 2:
25
*********************
 */
public class MultiplicationTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger bigInteger1 = new BigInteger(in.next());
        BigInteger bigInteger2 = new BigInteger(in.next());
        System.out.println(bigInteger1.multiply(bigInteger2));
        // gcd() - нахождение НОД (наибольшего общего делителя)
        System.out.println(bigInteger1.gcd(bigInteger2));
    }
}
