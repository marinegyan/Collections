package map;

import set.HashSet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<K, V> {
    private final int arrSize = 16;
    private final List<List<Entry<K, V>>> list = new ArrayList<>(arrSize);

    public HashMap() {
        for (int i = 0; i < arrSize; i++) {
            list.add(i,new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int index = key.hashCode() % arrSize;
        List<Entry<K, V>> bucket = list.get(index);
        for (int i = 0; i < bucket.size(); i++) {
            Entry<K, V> x = bucket.get(i);
            if (x.getKey().equals(key)) {
                System.err.println("Key must be unique");
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }

    public void remove(K key, V value) {
        int index = value.hashCode() % arrSize;
        List<Entry<K, V>> bucket = list.get(index);
        for (int i = 0; i < bucket.size(); i++) {
            Entry<K, V> x = bucket.get(i);
            if (x.getKey().equals(key)) {
                bucket.remove(x);
            }
        }
    }

    @Override
    public String toString() {
        return "list=" + list;
    }

    public static class Entry<K, V> {
        private V value;
        private K key;

        public Entry(K key, V value) {
            this.value = value;
            this.key = key;

        }

        public V getValue() {
            return value;
        }

        public K getKey() {
            return key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return
                    "value=" + value +
                            ", key=" + key
                    ;
        }
    }
}


