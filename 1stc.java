import java.util.Queue;
import java.util.LinkedList;

class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        System.out.println("Dequeued: " + q.remove());
    }
}
