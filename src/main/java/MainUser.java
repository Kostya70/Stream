import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainUser {
    public static void main(String[] args) {
//        List<User> users = new ArrayList<>();
//        users.add(new User("Alex", 35));
//        users.add(new User("Max", 22));
//        users.add(new User("John", 17));
//        users.add(new User("Andrew", 33));
//        users.add(new User("Jack", 44));
//        users.add(new User("Nick", 80));
//        users.add(new User("Alice", 46));
//        users.add(new User("Helen", 11));
//
//        int[] array = {3, 1, 3, 5, 14};
//        Stream.of(5,4,3,15,546);
//
//        users.stream()
//                .filter(user1 -> user1.getName().contains("l"))
//                .findAny()
//                .ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
//    }
//}
        List<Float> numbers = new ArrayList<>();
        for (int i = 0; i < 30_000_000; i++) {
            numbers.add((float)i);
        }
        long before = System.currentTimeMillis();
        numbers.parallelStream()
                .map((number) -> Math.sin(0.2f + number / 5) * Math.cos(0.2f + number / 5) * Math.cos(0.4f + number / 2))
                .collect(Collectors.toList());
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}

