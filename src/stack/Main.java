package stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<10;i++) {
            stack.push(i);
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.search(5));
        System.out.println(stack.empty());

    }
}