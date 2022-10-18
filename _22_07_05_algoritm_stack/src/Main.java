import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        System.out.println(stack.empty());
        System.out.println(stack.empty());

        Integer peek = stack.peek();
        System.out.println(stack.peek());
        System.out.println(stack.size());

        Integer pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack.empty());
        System.out.println(stack.size());

        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack.peek());
        System.out.println(stack.search(11));
        System.out.println(stack.search(12));
        System.out.println(stack.search(9));

        SpecialStack specialStack = new SpecialStack();
        specialStack.push(10);
        specialStack.push(24);
        specialStack.push(36);
        specialStack.push(18);
        System.out.println(specialStack.getMin());

        specialStack.push(5);
        System.out.println(specialStack.getMin());
        
    }
}
