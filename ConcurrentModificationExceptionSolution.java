import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionSolution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("apple", "banana", "cherry"));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("banana")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}