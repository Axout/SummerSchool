package _2_3_Encapsulation;

import java.util.ArrayList;

public class Stack {
    public int size;
    public ArrayList<Integer> stack;
    public int top;

    public Stack() {
        stack = new ArrayList<>();
    }
    // положить число на стек
    public void push(int value) {
        stack.add(value);
    }
    // вернуть вершину стека и извлечь элемент из стека, в случае извлечения максимума или
    // минимума необходимо найти новые максимум и минимум
    public int pop() {
        top = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;
    }
    // возвращает минимум стека
    public int getMin() {
        int mini = stack.get(0);
        for (int i : stack) {
            if (mini > i) mini = i;
        }
        return mini;
    }
    // возвращает максимум стека
    public int getMax()  {
        int maxi = stack.get(0);
        for (int i : stack) {
            if (maxi < i) maxi = i;
        }
        return maxi;
    }
    // возвращает длину стека
    public int size()  {
        return stack.size();
    }
    // проверяет стек на пустоту
    public boolean isEmpty()  {
        return stack.isEmpty();
    }
}
