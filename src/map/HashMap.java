package map;

import set.HashSet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<K, V> {




    public static class Entry<K,V> {
        private V value;
        private K key;

        public Entry(K key,V value) {
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


