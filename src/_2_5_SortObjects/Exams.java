package _2_5_SortObjects;

import java.util.*;

/*
Экзамены
В городе М все учащиеся сдают обязательные экзамены по трем предметам - математика, русский язык и информатика.
Результаты записываются и обрабатываются автоматизированной информационной системой.
После чего, система формирует общегородской отчет, который состоит из:

1) 1 строка - средний балл по математике, средний балл по русскому языку, средний балл по информатике,
общий средний балл - по всему городу(3 вещественных числа через пробел).

2) Каждая из последующих строк - номер школы, средний балл по математике, средний балл по русскому языку,
средний балл по информатике, общий средний балл - по конкретной школе.
Данные в отчете отсортированы по школам по общему среднему баллу по убыванию балла.
В случае равенства среднего балла, школы сортируются по среднему баллу по предметам с приоритетами 1 для математики,
2 для русского языка, 3 для информатики.

3) Последние несколько строк - фамилии и имена учащихся, набравших лучший результат и их балл по каждому из предметов,
в порядке: 1. Математика 2. Русский язык 3. Информатика.
В формате - Фамилия Имя балл
Если лучший результат набрало несколько учащихся, необходимо вывести всех учащихся каждого с новой строки,
отсортированных по Фамилии, а в случае одинаковых фамилий и по имени по возрастанию в лексографическом порядке.

Формат входных данных:
Подается целое число N - количество учащихся, которые сдают экзамен, далее следуют N строк с данными в формате:
Фамилия пробел Имя пробел номер школы пробел балл по математике пробел балл по русскому языку пробел балл по информатике
Количество школ не превосходит 100.
Количество учащихся не превосходит 10000.
Средний балл выводить с точностью до первого знака после запятой
Ответ выводить согласно примерам:
*/
/*
Sample Input 1:
7
Иванов Иван 32 80 80 80
Петров Петр 71 91 89 100
Олег Тинькоф 1 15 60 30
Воронов Максим 32 100 100 100
Зеленская Екатерина 1 75 99 67
Столярова Анна 17 78 87 77
Логинова Полина 89 66 54 78

Sample Output 1:
Отчет по городу: математика - 72.1, русский язык - 81.3, инфрматика - 76.0, общий средний балл - 76.5
Отчет по школам:
Школа № 71: математика - 91.0, русский язык - 89.0, инфрматика - 100.0, общий средний балл - 93.3
Школа № 32: математика - 90.0, русский язык - 90.0, инфрматика - 90.0, общий средний балл - 90.0
Школа № 17: математика - 78.0, русский язык - 87.0, инфрматика - 77.0, общий средний балл - 80.7
Школа № 89: математика - 66.0, русский язык - 54.0, инфрматика - 78.0, общий средний балл - 66.0
Школа № 1: математика - 45.0, русский язык - 79.5, инфрматика - 48.5, общий средний балл - 57.7
Лучший результат по математике - Воронов Максим - 100
Лучший результат по русскому языку - Воронов Максим - 100
Лучший результат по информатике - Воронов Максим - 100
Лучший результат по информатике - Петров Петр - 100
*/
/*
Sample Input 2:
5
Премудрая Василиса 1 0 0 0
Мудрый Ярослав 1 100 100 100
Старк Тони 1 80 80 80
Пим Хенк 1 100 100 100
Ричардс Рид 1 90 90 90

Sample Output 2:
Отчет по городу: математика - 74.0, русский язык - 74.0, инфрматика - 74.0, общий средний балл - 74.0
Отчет по школам:
Школа № 1: математика - 74.0, русский язык - 74.0, инфрматика - 74.0, общий средний балл - 74.0
Лучший результат по математике - Мудрый Ярослав - 100
Лучший результат по математике - Пим Хенк - 100
Лучший результат по русскому языку - Мудрый Ярослав - 100
Лучший результат по русскому языку - Пим Хенк - 100
Лучший результат по информатике - Мудрый Ярослав - 100
Лучший результат по информатике - Пим Хенк - 100
*/
/*
Sample Input 3:
8
Хоган Халк 52 0 0 0
Алая Ведьма 67 67 67 67
Бинарный Человек 16 32 64 128
Пепси Кола 2 20 25 25
Фейс Фейс 88 0 0 0
Палец Вверх 2 55 77 99
Стадион Зенит 1 500000000 0 0
Полет НаМарс 1 100000000 100 100

Sample Output 3:
Отчет по городу: математика - 75000021.8, русский язык - 41.6, инфрматика - 52.4, общий средний балл - 25000038.6
Отчет по школам:
Школа № 1: математика - 300000000.0, русский язык - 50.0, инфрматика - 50.0, общий средний балл - 100000033.3
Школа № 16: математика - 32.0, русский язык - 64.0, инфрматика - 128.0, общий средний балл - 74.7
Школа № 67: математика - 67.0, русский язык - 67.0, инфрматика - 67.0, общий средний балл - 67.0
Школа № 2: математика - 37.5, русский язык - 51.0, инфрматика - 62.0, общий средний балл - 50.2
Школа № 88: математика - 0.0, русский язык - 0.0, инфрматика - 0.0, общий средний балл - 0.0
Школа № 52: математика - 0.0, русский язык - 0.0, инфрматика - 0.0, общий средний балл - 0.0
Лучший результат по математике - Стадион Зенит - 500000000
Лучший результат по русскому языку - Полет НаМарс - 100
Лучший результат по информатике - Бинарный Человек - 128
 */
public class Exams {
    public static class Student {
        String name;
        int school, math, rus, info;

        public Student(String name, int school, int math, int rus, int info) {
            this.name = name;
            this.school = school;
            this.math = math;
            this.rus = rus;
            this.info = info;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", school=" + school +
                    ", math=" + math +
                    ", rus=" + rus +
                    ", info=" + info +
                    '}';
        }
    }

    public static class School {
        int number, allMath, allRus, allInfo, total, countStud;

        public School(Student student) {
            this.number = student.school;
            this.allMath = student.math;
            this.allRus = student.rus;
            this.allInfo = student.info;
            this.total = student.math + student.rus + student.info;
            this.countStud = 1;
        }

        public void addStudent(Student student) {
            this.allMath += student.math;
            this.allRus += student.rus;
            this.allInfo += student.info;
            this.total += student.math + student.rus + student.info;
            this.countStud++;
        }

        @Override
        public String toString() {
            return "School{" +
                    "number=" + number +
                    ", allMath=" + allMath +
                    ", allRus=" + allRus +
                    ", allInfo=" + allInfo +
                    ", total=" + total +
                    ", countStud=" + countStud +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Student [] students = new Student[N];

        // ввод студентов
        for (int i = 0; i < N; i++) {
            String fullName = in.next() + " " + in.next();
            students[i] = new Student(fullName, Integer.parseInt(in.next()), Integer.parseInt(in.next()), Integer.parseInt(in.next()), Integer.parseInt(in.next()));
        } System.out.println();
        System.out.println();

        // отчёт по городу
        cityReport(students);

        // отчёты по школам
        School [] schoolsArr = schoolReports(students);
        printSchools(schoolsArr);

        // лучшие результаты
        theBestResults(students);


    }

    public static School [] schoolReports(Student [] students) {
        Arrays.sort(students, Comparator.comparing(o -> o.school));
        ArrayList<School> schoolsList = new ArrayList<>();
        schoolsList.add(new School(students[0]));
        int countSchools = 0;

        for (int i = 1; i < students.length; i++) {
            if (schoolsList.get(countSchools).number == students[i].school)
                schoolsList.get(countSchools).addStudent(students[i]);
            else {
                schoolsList.add(new School(students[i]));
                countSchools++;
            }
        }

        School [] schoolsArr = new School[schoolsList.size()];
        schoolsList.toArray(schoolsArr);

        return schoolsArr;
    }

    public static void cityReport(Student [] students) {
        int N = students.length;
        double aveMath = 0;
        double aveRus = 0;
        double aveInfo = 0;
        double aveAll = 0;
        for (Student s: students) {
            aveMath += s.math;
            aveRus += s.rus;
            aveInfo += s.info;
            aveAll = aveAll + s.math + s.rus + s.info;
        }
        System.out.print(String.format(Locale.ENGLISH,
                "Отчет по городу: математика - %.1f, русский язык - %.1f, инфрматика - %.1f, общий средний балл - %.1f\n",
                aveMath / N, aveRus / N, aveInfo / N, aveAll / (N * 3)));
    }

    public static void theBestResults(Student [] students) {
        // по математике
        Arrays.sort(students, Comparator.comparing((Student o) -> -o.math).thenComparing((Student o) -> o.name));
        int i = 0;
        do {
            System.out.printf("Лучший результат по математике - " + students[i].name + " - %d\n", students[i].math);
            i++;
        }
        while (students[0].math == students[i].math);

        // по русскому языку
        Arrays.sort(students, Comparator.comparing((Student o) -> -o.rus).thenComparing((Student o) -> o.name));
        i = 0;
        do {
            System.out.printf("Лучший результат по русскому языку - " + students[i].name + " - %d\n", students[i].rus);
            i++;
        }
        while (students[0].rus == students[i].rus);

        // по информатике
        Arrays.sort(students, Comparator.comparing((Student o) -> -o.info).thenComparing((Student o) -> o.info));
        i = 0;
        do {
            System.out.printf("Лучший результат по информатике - " + students[i].name + " - %d\n", students[i].info);
            i++;
        }
        while (students[0].info == students[i].info);
    }

    public static void printSchools(School [] schoolsArr) {
        System.out.println("Отчет по школам:");
        for (School s : schoolsArr) {
            double aveMath = (double) s.allMath / s.countStud;
            double aveRus = (double) s.allRus / s.countStud;
            double aveInfo = (double) s.allInfo / s.countStud;
            double aveTotal = (double) s.total / (3 * s.countStud);

            System.out.print(String.format(Locale.ENGLISH,
                    "Школа № %d: математика - %.1f, русский язык - %.1f, инфрматика - %.1f, общий средний балл - %.1f\n",
                    s.number, aveMath, aveRus, aveInfo, aveTotal));
        }
    }
}
