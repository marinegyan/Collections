package queue;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue<V> {
    private final List<V> list = new LinkedList<>();

    public void add(V value) {
        list.add(value);
    }

    public V poll() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }
    public V peek(){
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
