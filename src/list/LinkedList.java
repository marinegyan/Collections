package list;

public class LinkedList {
    private Node head;
    private int size = 0;

    public void add(Integer value) {
        if (head == null) {
            head = new Node();
            head.value = value;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node();
            temp.next.value = value;
        }
        size++;
    }

    public void remove(Integer value) {
        if (head == null) {
            return;
        }
        if (head.value.equals(value)) {
            head = head.next;
        } else {
            Node temp = head;
            while (temp.next != null && !temp.next.value.equals(value)) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }
        size--;
    }
    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    private static class Node {
        private Node next;
        Integer value;

        @Override
        public String toString() {
            return
                    "next=" + next +
                            "value=" + value;

        }
    }
}