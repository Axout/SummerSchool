package _1_7_Long_arithmetic;


import java.math.BigInteger;
import java.util.Scanner;

/*
Длинные числа Фибоначчи
﻿Числа Фибоначчи определяются, исходя из рекуррентного соотношения:
f_{1} = 1
f_{2} = 1
f_{i} = f_{i-1} + f_{i-2} , i>2
Это означает, что каждое новое число является суммой двух предыдущих чисел.
При чем, первое и второе числа Фибоначчи -  равны 1.
Программа получает на вход натуральное число N, при чем N не превосходит 10^5
Программа должна вывести N-ое по порядку число Фибоначчи.
Рекурсия - не зайдет по времени.
*********************
Sample Input 1:
100

Sample Output 1:
354224848179261915075
*********************
Sample Input 2:
1000

Sample Output 2:
43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875
*********************
Sample Input 3:
5

Sample Output 3:
5
*********************
 */
public class LongFibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger a;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        for (int i = 2; i < n; i++) {
            a = b;
            b = c;
            c = a.add(b);
        }
        System.out.println(c);
    }
}
