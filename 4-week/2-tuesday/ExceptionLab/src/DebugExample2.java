import java.util.HashMap;
import java.util.LinkedList;
public class DebugExample2 {
    public static void main(String[] args) {
        LinkedList<String> nums = new LinkedList<>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        HashMap<String, Integer> combo = new HashMap<String, Integer>();
        combo.put(nums.get(0), 1);
        combo.put(nums.get(1), 2);
        combo.put(nums.get(2), 3);
        combo.put(nums.get(3), 4);
        System.out.println(combo.size());
        System.out.println(combo);


    }
}
