import java.util.*;

class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(100); // duplicate ignored

        System.out.println("Set: " + set);
    }
}

