package set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        System.out.println(hashSet.toString());
        hashSet.remove(3);
        System.out.println(hashSet.toString());
        System.out.println(hashSet.contains(2));
    }
}
