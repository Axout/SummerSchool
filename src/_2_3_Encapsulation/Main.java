package _2_3_Encapsulation;

import java.util.Scanner;

/*
Стек
Необходимо создать класс Stack. Для данного класса должны быть доступны следующие методы:
push(int value) - положить число на стек
pop() - вернуть вершину стека и извлечь элемент из стека, в случае извлечения максимума или
минимума необходимо найти новые максимум и минимум
getMin() - возвращает минимум стека
getMax() - возвращает максимум стека
size() - возвращает длину стека
isEmpty() - проверяет стек на пустоту
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер стэка: ");
        int sizeIn = in.nextInt();
        Stack myStack = new Stack();
        // push()
        for (int i = 0; i < sizeIn; i++) {
            myStack.push((int) (Math.random() * 100));
        }
        // output stack
        for (int i : myStack.stack) {
            System.out.print(i + " ");
        }
        System.out.println();
        // isEmpty()
        System.out.println("Стэк пустой? - " + myStack.isEmpty());
        // size()
        System.out.println("Длина стэка: " + myStack.size());
        // getMax()
        System.out.println("Макс. элемент стэка: " + myStack.getMax());
        // getMin()
        System.out.println("Мин. элемент стэка: " + myStack.getMin());
        // pop()
        System.out.println("Верхушка стэка: " + myStack.pop());
        // output stack
        for (int i : myStack.stack) {
            System.out.print(i + " ");
        }
        System.out.println();
        // pop()
        System.out.println("Верхушка стэка: " + myStack.pop());
    }
}
