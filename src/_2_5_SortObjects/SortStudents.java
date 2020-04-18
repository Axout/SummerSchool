package _2_5_SortObjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Сортировка учащихся
Класс ученик имеет поля имя и оценка.
Программа получает на вход число N, далее следует N строк с данными в формате:
Имя пробел оценка.
Необходимо отсортировать данный список учеников по убыванию оценок.
В случае равных оценок учеников необходимо отсортировать по возрастанию имени.
*********************
Sample Input 1:
5
Mike 5
Brus 4
Saima 3
Luke 3
Jason 3

Sample Output 1:
Mike 5
Brus 4
Jason 3
Luke 3
Saima 3
*********************
Sample Input 2:
4
Ivan 5
Petr 5
Oleg 4
Ilya 3

Sample Output 2:
Ivan 5
Petr 5
Oleg 4
Ilya 3
*********************
Sample Input 3:
6
Oleg 4
Oleg 5
Oleg 3
Oleg 2
Anya 2
Lisa 2

Sample Output 3:
Oleg 5
Oleg 4
Oleg 3
Anya 2
Lisa 2
Oleg 2
*********************
 */
public class SortStudents {
    protected static class Student {
        String name;
        int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name + " " + grade;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Student[] students = new Student[N];

        // ввод
        for (int i = 0; i < N; i++) {
            students[i] = new Student(in.next(), in.nextInt());
            //students[i] = new Student(in.next(), Integer.parseInt(in.next()));
        }
        // сортировка по возрастанию оценок
        Arrays.sort(students, Comparator.comparing((Student o) -> -o.grade).thenComparing((Student o) -> o.name));
        //Arrays.sort(students, Comparator.comparingInt(Student::getGrade).thenComparing(Student::getName, Collections.reverseOrder()));

        // вывыод по убыванию
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
