package _2_4_Inheritance_Abstract_classes;

import java.util.ArrayList;
import java.util.Scanner;

public class MainHero {
    public static void main(String[] args){
        System.out.println("Хэллоу мэн!");
        try { Thread.sleep(2000); } catch(InterruptedException ignored) {} // задержка 2 сек
        System.out.println("Выбирай себе героя: 1 - Воин, 2 - Лучник, 3 - Маг");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Hero myHero;
        switch (num) {
            case 1:
                myHero = new Warrior();
                break;
            case 2:
                myHero = new Archer();
                break;
            default:
                myHero = new Magician();
                break;
        }

        System.out.println("Твой герой - " + myHero.nickName);
        try { Thread.sleep(2000); } catch(InterruptedException ignored) {} // здержка 2 сек

        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy(30, 20, 1200)); // 1 - Пряничный человек
        enemies.add(new Enemy(2018, 1, 350)); // 2 - Туча комаров
        enemies.add(new Enemy(280, 50, 3050)); // 3 - Вор
        enemies.add(new Enemy(100500, 100500, 100500)); // 4 - Гальватрон

        // Собираем предметы
        findItem(myHero);

        // бой!
        fight(myHero, enemies);
    }

    public static void findItem(Hero myHero) {
        System.out.println("Собираем клад... Покури пока");
        try { Thread.sleep(2000); } catch(InterruptedException ignored) {} // здержка 2 сек
        //найден клад
        for (int i = 0; i < 300; i++){
            Item item = new Item(0, 0, i % 3); // i%3 - будет задавать предмету тип 0, 1, 2
            myHero.openItem(item);  // герои получает предмет в руки
        }
        System.out.println("Всего собрано: " + myHero.items.size());
        System.out.println("***********************************");
        try { Thread.sleep(1000); } catch(InterruptedException ignored) {} // здержка 1 сек
    }

    public static void fight(Hero myHero, ArrayList<Enemy> enemies) {
        int count = 1;
        for (Enemy enemy : enemies) {
            System.out.println( count++ + "-й бой:");
            System.out.println("  Герои { hp=" + myHero.hp + " mana=" + myHero.mana + " }");
            System.out.println("  Враг { hp=" + enemy.hp + " }");
            try { Thread.sleep(2000); } catch(InterruptedException ignored) {} // здержка 2 сек

            // сражения!
            int counter = 1;
            while (myHero.hp > 0 & enemy.hp > 0) {
                System.out.println( counter++ + " раунд:");
                // герой атакует врага
                myHero.attack(enemy);
                // если враг ещё дышит, то наносит ответный удар
                if (enemy.hp > 0) {
                    myHero.defense(enemy);
                    // итоги раунда:
                    System.out.println("    Герои { hp=" + myHero.hp + " mana=" + myHero.mana + " }");
                    System.out.println("    Враг { hp=" + enemy.hp + " }");
                    try { Thread.sleep(2000); } catch(InterruptedException ignored) {} // здержка 2 сек
                }
            }

            // кто победил?
            if (myHero.hp > 0) {
                System.out.println("Победа! Ура! Поздравляю вас");
                try { Thread.sleep(500); } catch(InterruptedException ignored) {} // здержка
                System.out.println("Герой получил опыт +" + enemy.exp);
                try { Thread.sleep(500); } catch(InterruptedException ignored) {} // здержка
                System.out.println("Идёт прокачка героя...Ждите...");
            }
            else {
                System.out.println("Ваш герой был убит...");
                break;
            }
            try { Thread.sleep(3000); } catch(InterruptedException ignored) {} // здержка 3 сек

            // итоги боя
            System.out.printf("Герой { HP=%d, MANNA=%d, damage=%d, exp=%d }\n", myHero.hp, myHero.mana, myHero.damage, myHero.exp);
            System.out.println("***********************************");
            try { Thread.sleep(1000); } catch(InterruptedException ignored) {} // задержка 3 сек

            // продолжение банкета
            System.out.println("Следующий раунд? 0 - нет, 1 - да");
            Scanner in = new Scanner(System.in);
            int next = in.nextInt();
            if (next == 0) break;
        }
    }
}
