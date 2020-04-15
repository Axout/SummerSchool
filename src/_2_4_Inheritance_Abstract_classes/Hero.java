package _2_4_Inheritance_Abstract_classes;

import java.util.ArrayList;

/*
Почти РПГ
Герой игры обладает никнеймом, силой, ловкостью и интеллектом, помимо этого у него есть здоровье,
мана и опыт и позиция на карте в координатах х, у. Любой герой может переместиться за курсором, атаковать,
защищаться, выполнить действие. Герой может принадлежать любому из 3 классов - маг, воин, лучник.
При создании персонажа у пользователя есть выбор класса.
Помимо базовых характеристик героя, у классов есть свои особенности:
Маг имеет больший запас маны при создании и способен атаковать на расстоянии.
Маг имеет возможность произносить заклинания из списка.
Маг имеет возможность изучать заклинания в случае нахождения свитка соответствующего заклинания.
Воин имеет больший запас здоровья при создании, больший урон с руки, возможность атаковать при помощи предмета.
Лучник - имеет лук при создании и способен атаковать на расстоянии. Лучник имеет возможность избежать урон при атаке
и умеет открывать любые замки.
Необходимо описать недостающие методы и добавить часть кода для того, чтобы программа заработала.
Механика метода attack - герой всегда наносит удар первым, потом ждет удара от цели и так до гибели кого либо из атакующих.
В случае убийства цели (здоровье цели упало до 0 или ниже) - цель удар не наносит. В этом случае герой приобретает опыт цели.
Каждые 500 единиц опыта герой получает новый уровень и это влияет на его характеристике в соответствии с описанием ниже.
Если цель убивает героя необходимо вывести в консоль "Ваш герой был убит".
 */
class Item{
    int price, weight, type;
    public Item(int price, int weight, int type){
        this.price = price;
        this.weight = weight;
        this.type = type;
    }
}

class Enemy{
    int hp, damage;
    int exp;
    public Enemy(int hp, int damage, int exp){
        this.hp = hp;
        this.damage = damage;
        this.exp = exp;
    }
}

abstract class Hero{

    protected String nickName;
    protected int s, a, i, exp, hp, mana, level; // сила ловкость интеллект опыт здоровье мана уровень
    protected int x, y; // координаты героя на карте
    protected ArrayList<Item> items = new ArrayList<>(); // список поднятых предметов
    protected int damage; // урон

    public int getMana(){
        return mana;
    }
    public int getDamage(){
        return damage;
    }
    public int getHp(){
        return hp;
    }
    public void goToCursor(int xx, int yy){
        x = xx; y = yy;
    }

    public abstract void attack(Enemy enemy); // этот метод должнен быть определен в классах наследниках

    public abstract void defense(Enemy enemy);// этот метод должнен быть определен в классах наследниках

    public void openItem(Item item) {
        // метод должен добавлять предмет в список с вероятностью 50 %
        // для осуществления вероятностных процессов можно использовать случайное число от 0 до 100.
        int probability = (int) (Math.random() * 100);
        if (probability > 50) items.add(item);
    }
}

class Warrior extends Hero{
    public Warrior(){
        //базовые значение
        this.nickName = "Warrior";
        this.hp = 500;
        this.mana = 10;
        this.s = 100;
        this.a = 50;
        this.i = 1;
        this.exp = 0;
        this.damage = 150;
        this.level = 0;
    }

    @Override
    public void attack(Enemy enemy) {

        enemy.hp -= this.damage;
        if (enemy.hp <= 0) {
            int newLevels = ((this.exp % 500) + enemy.exp) / 500;
            this.hp += newLevels * 200;
            this.mana += newLevels * 10;
            this.s += newLevels * 10;
            this.a += newLevels * 10;
            this.i += newLevels * 10;
            this.exp += enemy.exp;
            this.damage += newLevels * 20;
            this.level += newLevels;
        }
    }

    @Override
    public void defense(Enemy enemy) {

        this.hp -= enemy.damage;
    }
/*
класс должен обладать всеми свойствами героя при создании воин должен обладать следующими характеристиками:
здоровье - 500, мана - 10, сила - 100, ловкость - 50, интеллект - 1, опыт 0, урон - 150.
При атаке герой наносит цели урон и получает урон в ответ от цели, действия повторяются пока кто то не победит.
В случае победы герой получает опыт цели, каждые 500 единиц опыта герой получает новый уровень.
Новый уровень дает +10 ко всем характеристикам, +200 здоровья и +20 урона.Если воин имеет предмет 1 типа,
к его урону добавляется 100.
Уже мертвая цель - урона герою не наносит!!!
*/
}

class Archer extends Hero{
    public Archer(){
        //базовые значение
        this.nickName = "Archer";
        this.hp = 200;
        this.mana = 50;
        this.s = 20;
        this.a = 150;
        this.i = 30;
        this.exp = 0;
        this.damage = 200;
        this.level = 0;
    }

    @Override
    public void attack(Enemy enemy) {

        enemy.hp -= this.damage;
        if (enemy.hp <= 0) {
            int newLevels = ((this.exp % 500) + enemy.exp) / 500;
            this.hp += newLevels * 50;
            this.mana += newLevels * 10;
            this.s += newLevels * 10;
            this.a += newLevels * 30;
            this.i += newLevels * 10;
            this.exp += enemy.exp;
            this.damage += newLevels * 50;
            this.level += newLevels;
        }
    }

    @Override
    public void defense(Enemy enemy) {

        int probably = (int) (Math.random() * 100);
        if (probably >= 30) {
            this.hp -= enemy.damage;
        }
    }

    public void openItem(Item item) {
        items.add(item);
    }
/*
класс должен обладать всеми свойствами героя при создании лучник должен обладать следующими характеристиками:
здоровье - 200, мана - 50, сила - 20, ловкость - 150, интеллект - 30, опыт 0, урон - 200.
атака по аналогии с воином, но в процессе атаки лучник имеет 30% шанс избежать урон
лучник всегда открывает предмет - 100%
Новый уровень дает +10 ко всем характеристикам, +50 здоровья и +50 урона и 30 ловкости.
*/
}

class Magician extends Hero{
    public Magician(){
        //базовые значение
        this.nickName = "Magician";
        this.hp = 100;
        this.mana = 5000;
        this.s = 5;
        this.a = 30;
        this.i = 300;
        this.exp = 0;
        this.damage = 40;
        this.level = 0;
    }
    private ArrayList<Item> casts = new ArrayList<>();
/*
Класс должен обладать всеми свойствами героя при создании маг должен обладать следующими характеристиками:
здоровье - 100, мана - 5000, сила - 5, ловкость - 30, интеллект - 300, опыт 0, урон - 40.
Атака по аналогии с воином, но помимо обычной атаки, маг имеет возможность бить заклинанием в процессе атаки.
В случае возможности убить врага с руки - маг бьет с руки!!! в первую очередь
Защита мага осуществляется магическим щитом, который полгащает весь урон, но вместо здоровья тратит ману.
Новый уровень дает +10 ко всем характеристикам, +30 здоровья, 1000 маны и +10 урона.
*/
    public void makeCast(Enemy enemy){
        // если в списке есть заклятия можно его произнести потратив 100 маны и нанеся 1000 урона цели.
        // после произнесения предмет из списка пропадает
        enemy.hp -= 1000;
        this.mana -= 100;
        casts.remove(casts.size() - 1);
    }

    public void eduCast(Item item){
        // если предмет или предметы из списка имеют тип 2,
        // это заклинания и их нужно добавить в список заклинаний мага
        if (item.type == 2) {
            casts.add(item);
        }
    }

    public void openItem(Item item) {

        int probability = (int) (Math.random() * 100);
        if (probability > 50) {
            items.add(item);
            eduCast(item);
        }
    }

    @Override
    public void attack(Enemy enemy) {
        // если следующий удар врага решающий и список заклятий не пустой, то бьёт заклятьем
        if (this.hp - enemy.damage <= 0 && casts.isEmpty()) {
            makeCast(enemy);
        }
        // если ещё не решающий, то - с руки
        else {
            enemy.hp -= this.damage;
        }

        if (enemy.hp <= 0) {
            int newLevels = ((this.exp % 500) + enemy.exp) / 500;
            this.hp += newLevels * 30;
            this.mana += newLevels * 100;
            this.s += newLevels * 10;
            this.a += newLevels * 10;
            this.i += newLevels * 10;
            this.exp += enemy.exp;
            this.damage += newLevels * 10;
            this.level += newLevels;
        }
    }

    @Override
    public void defense(Enemy enemy) {
        if (this.mana > 0)
            this.mana -= enemy.damage;
        else
            this.hp -= enemy.damage;
    }
}
