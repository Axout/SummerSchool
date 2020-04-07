package _2_2_Methods_Fields;

import java.util.Arrays;

/*
Динамический массив  целых чисел
Спроектируйте класс Array. Массив должен обладать двумя свойствами:
    1) public int size
    2) public int [] data
В в классе Array должен быть реализован метод:
    1) public void add(int element)
Данный метод должен помещать новый элемент в конец массива, а длину массива увеличивать на 1.
В случае переполнения - необходимо увеличить длину массива data (необходимо выделить новый кусок большей длины,
и скопировать в него данные, добавленные в data на предыдущих шагах)

Проверка вашего класса осуществляется слеующим способом:
    1) Создается экземпляр вашего класса inst
    2) Случайным образом формируется число N от 1 до 10^5
    3) Случайные числа от 1 до 100 - N раз добавляются добавляются в ваш массив методом add
    4) Проверяется inst.size, inst.data[i], для i от 0 до N-1
 */

public class MainArray {
    public static void main(String[] args) {
        // создаём объект
        Array inst = new Array();
        // генерируем количесво элементов
        int n = (int) (Math.random() * 100000);
        System.out.println("Число добавляемых элементов: " + n);
        // добавляем n случайных элементов
        for (int i = 0; i < n; i++) {
            inst.add((int) (Math.random() * 100));
        }
        System.out.println("Размер массива: " + inst.data.length);
        // выведем массив для проверки
        for (int i : inst.data) {
            System.out.print(i + " ");
        }
    }
    public static class Array {
        public int size;    // по-сути порядковый номер элемента в массиве
        public int [] data = new int[100];

        public void add(int element) {
            // заполняем массив по мере поступления элементов
            data[size] = element;
            size++;
            // когда количесво элементов сравняется с текущей объявленной длиной массива,
            // копируем данные в новый, увеличенный вдвое массив
            if (size == data.length) {
                data = Arrays.copyOf(data, data.length * 2);
            }
        }
    }
}