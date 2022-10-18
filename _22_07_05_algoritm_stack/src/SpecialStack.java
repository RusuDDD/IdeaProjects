import java.util.Stack;

public class SpecialStack extends Stack {
    Stack<Integer> specialMinElement = new Stack<>();
    public int getMin() {


        return specialMinElement.peek();
    }
    public void push(int x) {
        if (super.isEmpty()) {
            super.push(x);
            specialMinElement.push(x);
        } else
            super.push(x);
        int min = specialMinElement.peek();
        if (x < min) {
            specialMinElement.push(x);
        } else {
            specialMinElement.push(min);
        }
    }
    public Integer pop() {
        int x = (int) super.pop();
        specialMinElement.pop();
        return x;
    }
}