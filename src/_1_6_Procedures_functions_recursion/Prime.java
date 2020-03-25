package _1_6_Procedures_functions_recursion;

import java.util.Scanner;

/*
Prime
Реализуйте функцию проверки числа на простоту.
Постарайтесь найти оптимальное решение с асимптотикой O((n)^{1/2})
*********************
Sample Input 1:
5
Sample Output 1:
true
*********************
Sample Input 2:
12
Sample Output 2:
false
*********************
 */
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(n);
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(long n) {
        return n > 0 && n % 2 != 0;
    }
}
