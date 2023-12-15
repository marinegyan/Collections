package set;

import java.util.ArrayList;
import java.util.List;

public class HashSet<K> {






public static class Entry<K>{
    private K value;

    public Entry(K value) {
        this.value = value;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }
}
}
