import java.util.Stack;
class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        System.out.println("Popped: " + st.pop());
    }
}
