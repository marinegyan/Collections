package list;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
       arrayList.add(1);
       arrayList.add(2);
       arrayList.add(3);
       arrayList.add(4);
       arrayList.add(5);
       arrayList.print();
       arrayList.remove(5);
       arrayList.print();
       System.out.println(arrayList.contains(1));



    }
}
