package set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashSet<V> {
    @Override
    public String toString() {
        return
                " list=" + list +
                '}';
    }

    private final int arrSize = 16;
    private final List<List<Entry<V>>> list = new ArrayList<>(arrSize);

    public HashSet() {
        for (int i = 0; i < arrSize; i++) {
            list.add(i, new LinkedList<>());
        }
    }

    public void add(V value) {
        int index = value.hashCode() % arrSize;
        List<Entry<V>> bucket = list.get(index);
        for (int i = 0; i < bucket.size(); i++) {
            Entry<V> x = bucket.get(i);
            if (x.getValue().equals(value)) {
                return;
            }
        }
        bucket.add(new Entry<>(value));
    }
    public void remove(V value){
        int index = value.hashCode() % arrSize;
        List<Entry<V>> bucket = list.get(index);
        for(int i=0;i< bucket.size();i++){
            Entry<V> x = bucket.get(i);
            if(x.getValue().equals(value)){
                bucket.remove(x);
            }
        }
    }
    public boolean contains(V value) {
       int index = value.hashCode()%arrSize;
       List<Entry<V>> bucket = list.get(index);
       for(int i = 0;i< bucket.size();i++){
           Entry<V> x = bucket.get(i);
           if(x.getValue().equals(value)){
               return true;
           }
       }
       return false;
    }

    public static class Entry<V>{
    private V value;

    public Entry(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

        @Override
        public String toString() {
            return
                    "value=" + value;

        }
    }
}
