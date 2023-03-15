import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainFilterMapCollect {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 100 + 100));
        }
        List<String> result = numbers.stream()
                .filter((integer -> integer % 2 == 0 && integer % 5 == 0))
                .map(Math::sqrt)
                .map(MainFilterMapCollect::mapToString)
                .collect(Collectors.toList());
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static String mapToString(double a) {
        return "Sqrt: " + a;
    }

    private static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers) {
            result.add("Number: " + number);
        }
        return result;
    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
}
}
