public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("apple", "banana", "cherry"));

        for (String fruit : list) {
            if (fruit.equals("banana")) {
                list.remove(fruit); // ConcurrentModificationException
            }
        }
        System.out.println(list);
    }
}