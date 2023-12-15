package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Stack<V> {
    private final List<V> list = new LinkedList<>();


    public void push(V value){
        list.add(value);
    }
    public V pop(){
        if(list.isEmpty()){
            throw new RuntimeException();
        }
        return list.remove(list.size()-1);
    }
    public void peek(V value){
        System.out.println(list.get(list.size()-1));
    }
    public Integer search(V value){
        return list.indexOf(value);
    }
    public boolean empty(){
        return list.isEmpty();
    }
}
