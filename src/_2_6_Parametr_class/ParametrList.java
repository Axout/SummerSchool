package _2_6_Parametr_class;

/*
Спроектируйте параметризованный класс ParametrList
с полями size, data
и методами size(), add(value), get(index), set(index, value), remove(index), insert(index, value)
find(value)
*/
public class ParametrList<E> {
    private Object [] data;
    private int size;

    public ParametrList() {
        size = 0;
        data = new Object[100];
    }

    public int find(E value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) return i;
        }
        return -1;
    }

    public void insert(int index, E value) {
        for (int i = size; i > index; i--)
            data[i] = data[i-1];
        // тоже самое:
        // if (size - index >= 0) System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = value;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size-1; i++)
            data[i] = data[i+1];
        size--;
    }

    public void set(int index, E value) {
        data[index] = value;
    }

    public E get(int index) {
        return (E) data[index];
    }

    public int size() {
        return size;
    }

    public void add(E value) {
        data[size] = value;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++) s.append(data[i]).append(" ");
        return s.toString();
    }
}
