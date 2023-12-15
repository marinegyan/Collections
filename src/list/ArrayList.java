package list;

import java.util.Arrays;

public class ArrayList<V> {
    private Object[] array = new Object[10];
    int size = 0;

    private void arraySizeChanger() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void add(V value) {
        if (size == array.length) {
            arraySizeChanger();
        }
        array[size++] = value;
    }

    public void add(V value, int index) {
        if (size == array.length) {
            arraySizeChanger();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(V value) {
        int index = -1;
        for (int i = 0; i < array.length - 1; i++) {
            if (value.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
        }

    }

    public boolean isEmpty() {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == null) {
                count++;
            }
        }
        if (count != 0) {
            return true;
        }
        return false;
    }

    public boolean contains(V value) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public Object get(int index) {
        return array[index];
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


