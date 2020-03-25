package _1_7_Long_arithmetic;

import java.math.BigInteger;
import java.util.Scanner;

/*
Сумма двух чисел
Нужно сложить два очень больших числа.
*********************
Sample Input 1:
165165156151515161516515616515151515616516515616151516516161651 565565555555555555555556151

Sample Output 1:
165165156151515161516515616515151516182082071171707072071717802
*********************
 */
public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger bigInteger1 = new BigInteger(in.next());
        BigInteger bigInteger2 = new BigInteger(in.next());
        System.out.println(bigInteger1.add(bigInteger2));
    }
}
