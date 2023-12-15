package map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Good morning");
        hashMap.put(2,"Good afternoon");
        hashMap.put(1,"Good night");
        System.out.println(hashMap.toString());
    }
}
